package template;

import java.util.Scanner;

public abstract class Course implements ICourse {
    private Scanner input;
    public Course() {input = new Scanner(System.in);}


    protected String read() {
        return input.next();
    }

    protected String readLine() {
        return input.nextLine();
    }

    protected int readInt() {
        return input.nextInt();
    }

    protected double readDouble() {
        return input.nextDouble();
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
        System.out.println();
    }

    protected void print(Object... objs) {
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i]);
            if (i != objs.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
