package course.CourseHomework;

import template.Course;
import java.util.Scanner;
import arc.Console;

public class Homework2 extends Course {
	@Override
	public void run() {
		Console console = new Console();
		console.println("Input a word: ");
		String t = console.readLine();
		console.closeWindow();
	}
}
