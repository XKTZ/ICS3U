package course.CourseHomework;
import arc.*;
import template.*;

public class HomeworkIf extends CourseClassFormat {
	
	@Override
	public void run() {
		ques6();
	} 
	
	private void ques1() {
		double dblMark = nextDouble("Input your mark: ");
		if (dblMark < 60) {
			println("Fail");
		} else {
			println("Pass");
		}
	}
	
	private void ques2() {
		double dblInput = nextDouble("Input a number: ");
		if (dblInput < 0) {
			println("Negative numbers do not have a square root value");
		}else {
			println(Math.sqrt(dblInput));
		}
	}
	
	private void ques3() {
		double dblA = nextDouble("Side A: ");
		double dblB = nextDouble("Side B: ");
		double dblC = nextDouble("Side C: ");
		double dblS = (dblA + dblB + dblC) / 2;
		if (dblA < dblS && dblB < dblS && dblC < dblS) {
			println(Math.round(Math.sqrt(dblS * (dblS - dblA) * (dblS - dblB) * (dblS - dblC))*100)/100);
		} else {
			println("Error, can't make a triangle");
		}
	}
	
	private void ques4() {
		double dblMark = nextDouble("Enter your mark:" );
		if (dblMark < 0) {
			println("Mark must be positive");
		} else if (dblMark < 50) {
			println("F");
		} else if (dblMark < 60) {
			println("E");
		} else if (dblMark < 70) {
			println("D");
		} else if (dblMark < 80) {
			println("C");
		} else if (dblMark < 90) {
			println("B");
		} else if (dblMark <= 100) {
			println("A");
		} else {
			println("Mark must be smaller or equal to 100");
		}
	}
	
	private void ques5() {
		double dblA, dblB, dblC, dblDelta;
		dblA = nextDouble("A: ");
		dblB = nextDouble("B: ");
		dblC = nextDouble("C: ");
		dblDelta = dblB * dblB - 4 * dblA * dblC;
		if (dblDelta < 0) {
			println("No real roots");
		} else {
			double dblSqrtDelta = Math.sqrt(dblDelta);
			println((-dblB + dblSqrtDelta)/(2*dblA), (-dblB - dblSqrtDelta)/(2*dblA));
		}
	}
	
	private void ques6() {
		char chrName = nextLine("The name of person: ").charAt(0);
		chrName = Character.toUpperCase(chrName);
		if ('a' <= chrName && chrName <= 'I') {
			println('1');
		} else if ('I' < chrName && chrName <='P') {
			println('2');
		} else if ('P' < chrName && chrName <= 'Z') {
			println('3');
		} else {
			println("Do not contain the case of this person's name");
		}
	}
}
