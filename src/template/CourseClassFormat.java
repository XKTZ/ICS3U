package template;
import arc.*;

public abstract class CourseClassFormat implements ICourse {
	protected Console console = new Console();
	
    protected String read() {
        return console.readLine();
    }
    
    protected String readLine() {
        return console.readLine();
    }

    protected int readInt() {
        return console.readInt();
    }

    protected double readDouble() {
        return console.readDouble();
    }
    
    protected int nextInt(Object... objs) {
        print(objs);
        return readInt();
    }

    protected double nextDouble(Object... objs) {
        print(objs);
        return readDouble();
    }

    protected String next(Object... objs) {
        print(objs);   
        return read();
    }

    protected String nextLine(Object... objs) {
        print(objs);
        return readLine();
    }
    
    protected void println(Object... objs) {
        print(objs);
        console.println();
    }

    protected void print(Object... objs) {
        for (int i = 0; i < objs.length; i++) {
            console.print(objs[i]);
            if (i != objs.length - 1) {
                console.print(" ");
            }
        }
    }
    
    protected void clear() {
		console.clear();
	}
	
	protected void sleep(long mi) {
		console.sleep((int) mi);
	}
}
