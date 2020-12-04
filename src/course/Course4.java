package course;

import arc.*;
import template.Course;

/**
 * About "if" statement
 **/
public class Course4 extends Course{
	
	Console console = new Console();
	
	@Override
	public void run() {
	}
	
	private void menuChse() {
		String strMenu;
		char chrMenu;
		println("Welcome to the everything circle calculator");
		println("Do you want to?");
		println("(c) calculate the circumfrence of a circle?");
		println("(a) calculate the area of a circle?");
		println("(v) calculate the volume of a sphere?");
		println("(s) calculate the surface area of a sphere?");
		
		strMenu = con.readLine();
		charMenu = strMenu.charAt(0);
		
		if (chrMenu == 'c') {
			println("You have chosen to calculate circumference");
		} else if (chrMenu == 'a') {
			println("You have chosen to calculate area");
		} else if (chrMenu == 'v') {
			println("You have chosne to calculate volume of sphere");
		} else if (chrMenu == 's') {
			println("You have chosen to calculate surface area of sphere");
		} else {
			
		}
	}
	
	private void stringOperation () {
		String strFavMovie;
		String strPart;
		int intLength;
		
		println("Enter your favorite movie");
		strFavMovie = readLine();
		
		intLength = strFavMovie.length();
		println("There are this many letters:", intLength);
		
		strPart = strFavMovie.substring(0, 4);
		println("part of this movie is:", strPart);
		
		if (strPart.equals("star") {
			println("You are so chilll, Can I be yoru friend?");
		} else {
			println("You are boring");
		}
	}
	
	private void markCheck() {
		
		double dblCourse1;
		double dblCourse2;
		double dblCourse3;
		double dblCourse4;
		double dblCourse5;
		double dblCourse6;
		double dblCourse7;
		double dblCourse8;
		double dblAverage;
		
		println("Enter mark for course 1: ");
		dblCourse1 = console.readDouble();
		println("Enter mark for course 2: ");
		dblCourse2 = console.readDouble();
		println("Enter mark for course 3: ");
		dblCourse3 = console.readDouble();
		println("Enter mark for course 4: ");
		dblCourse4 = console.readDouble();
		println("Enter mark for course 5: ");
		dblCourse5 = console.readDouble();
		println("Enter mark for course 6: ");
		dblCourse6 = console.readDouble();
		println("Enter mark for course 7: ");
		dblCourse7 = console.readDouble();
		println("Enter mark for course 8: ");
		dblCourse8 = console.readDouble();
		
		dblAverage = (dblCourse1 +dblCourse2 +dblCourse3 +dblCourse4 +dblCourse5 +dblCourse6 +dblCourse7 +dblCourse8) / 8;
		println("Your average", dblAverage);
		if (dblAverage >= 95) {
			println("Waterloo");
		} else if (dblAverage >= 85 && dblAverage < 95) {
			println("U of T");
		} else if (dblAverage >= 75 && dblAverage < 85) {
			println("Ryerson");
		} else {
			println("Maybe Comp Eng is not a program for you");
		}
	}
	
	private double runInArray() {
		double[] b = new double[8];
		double dblAverage = 0;
		for (int i = 0; i < 8; i++) {
			double thismark = Math.random() * 101;
			b[i] = thismark;
			dblAverage += b[i];
		}
		return dblAverage / 8;
		
	}
	
	@Override
	public void println(Object... os) {
		for (Object o: os) {
			console.print(o.toString() + " ");
		}
		console.println();
	}
	
	@Override
	public double readDouble() {
		return console.readDouble();
	}
	
	@Override
	public String readLine() {
		return console.readLine();
	}
}
