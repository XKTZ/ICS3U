package course;

import template.Course;

public class CourseBase extends Course {
    @Override
    public void run() {
        basic4();
    }

    private void basic2() {
        println("What is your name?");
        String name = readLine();
        println("Hello! " + name);
    }

    private void basic3() {
        int intAge, intDays;
        println("how old are you?");
        intAge = readInt();
        intDays = intAge * 345;
        println("You have been alive for " + intDays + " days");
    }

    private void basic4() {
        double dblA;
        double dblB;
        double dblC;
        println("Welcome to the phythagorean theorem calculator");
        println("Give me side A");
        dblA = readDouble();
        println("Give me side B");
        dblB = readDouble();
        dblC = Math.sqrt(dblA * dblA + dblB * dblB);
        println(dblC);
    }
}
