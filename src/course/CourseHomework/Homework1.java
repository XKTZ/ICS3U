package course.CourseHomework;

import template.Homework;

public class Homework1 extends Homework  {
    @Override
    public void run() {
        ques1();
    }

    private void ques1() {
        println("     *     ");
        println("    * *    ");
        println("   *   *   ");
        println("    * *    ");
        println("     *     ");
    }

    private void ques2() {
        print("Integer a: ");
        int a = readInt();
        print("Integer b: ");
        int b = readInt();
        println("Sum:", a+b);
        println("Difference:", a-b);
        println("Product:", a*b);
        println("Modulus:", a%b);
    }

    private void ques3() {
        print("Radius of circle: ");
        double r = nextDouble();
        double circumference = 2*r*Math.PI;
        double area = (r*r)*Math.PI;
        println("Size:", circumference);
        println("Area:", area);
    }

    private void ques4() {
        double F = nextDouble("In Fahrenheit: ");
        println("In Celsius:", Math.round((5.0/9)*(F-32)));
    }

    private void ques5() {
        double L = nextDouble("In kilometer: ");
        println("In mile:", Math.round(1.0*L/1.609));
    }

    private void ques6() {
        int intHour = nextInt("In hour: ");
        println(String.format("%d days, %s hours", intHour / 24, intHour%24));
    }
    
    private void ques7() {
        int a = nextInt("First side: ");
        int b = nextInt("Second side: ");
        println(Math.round(Math.sqrt(a*a + b * b)));
    }

    private void ques8() {
        int a = nextInt("a: ");
        int b = nextInt("b: ");
        int c = nextInt("c: ");
        double s = (0.5) * (a+b+c);
        println(Math.round(Math.sqrt(s * (s-a) * (s-b) * (s-c))));
    }

    private void ques9() {
        int degreeMeasure = nextInt("Degree Measure: ");
        println(Math.toRadians(degreeMeasure));
    }

    private void ques10() {
        double a = nextDouble("a: ");
        double b = nextDouble("b: ");
        double c = nextDouble("Degree: ");
        println((0.5) * ((1.0) *a * b * Math.sin(Math.toRadians(c))));
    }

    private void ques11() {
        double a = nextDouble("a: ");
        double b = nextDouble("b: ");
        double c = nextDouble("Degree: ");
        println(Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c))));
    }

    private int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        } else {
            int p = pow(a, b/2);
            if (b % 2 == 0) {
                return p * p;
            } else {
                return p * p * a;
            }
        }
    }

    private void ques12() {
        int a = nextInt(a);
        int b = nextInt(b);
        println(pow(a, b));
    }

    private double round(double a, int b) {
        double t = 1.0 * (pow(10, b));
        return Math.round(a * t) / t;
    }

    private void ques13() {
        double a = nextDouble("Decimal: ");
        println(round(a, 3));
    }

}