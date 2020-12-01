package course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CourseConfigure {
    public static CourseConfigure DEFAULT_CONFIGURE = new CourseConfigure();
    private static BufferedReader file = null;
    private String classNameRunning = null;
    private Runnable needToRun = null;
    private String message;
    private String classPath;
    private static final String PREFIX = "course.Course";

    public CourseConfigure() {
        classPath = "../res/course_name";
    }

    public CourseConfigure(String name) {
        classPath = name;
    }

    /**
     * Run the course
     */
    public synchronized void run() {
        if (needToRun == null) {
            needToRun = getRunnableNeedToRun();
        }
        if (needToRun != null) {
            needToRun.run();
        }
    }

    /**
     * get the runnable object need to run by configuration
     * @return the runnable need to run
     */
    public Runnable getRunnableNeedToRun() {
        if (needToRun != null) {
            return needToRun;
        }
        try {
            Class<Runnable> clazz = (Class<Runnable>) Class.forName(getClassNameRunning());
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            err("Exception in initiallizing class", e.getMessage());
            return null;
        }
    }

    /**
     * get the class name need to run
     * @return the class name
     */
    public String getClassNameRunning() {
        if (classNameRunning == null) {
            int suc = initFile();
            if (suc != 0) {
                err(suc==1?"FileNotFoundException":"IOException", message);
            }
        }
        return classNameRunning;
    }

    /**
     * init the file
     * @return 0: success 1: file not found exception 2: ioexception
     */
    private int initFile() {
        if (file == null) {
            try {
                file = new BufferedReader(new FileReader(classPath));
                classNameRunning = PREFIX + file.readLine();
            } catch(FileNotFoundException fnfe) {
                message = fnfe.getMessage();
                return 1;
            } catch (IOException ioe) {
                message = ioe.getMessage();
                return 2;
            }
        }
        return 0;
    }

    private synchronized void err(String type, Object obj) {
        System.err.println(type + ": " + obj.toString());
    }
}
