package course.CourseHomework;
import arc.*;
import template.CourseClassFormat;

public class HomeworkLooping extends CourseClassFormat {
	
	@Override
	public void run() {
		ques15();
	}
	
	private void ques1() {
		int i = 11;
		while (--i > 0) {
			println(i);
		}
	}
	
	private void ques2() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 30; j ++) {
				println(j + 1);
			}
		}
	}
	
	private void ques3() {
		for (int i = 0; i < 21; i++) {
			println(1.0 * Math.round(((1.0 * i * 9 / 5) + 32) * 100) / 100);
		}
	}
	
	private void ques4() {
		double k = 0;
		for (int i = 0; i < 5; i++) {
			k += nextDouble("Enter number " + (i+1) + ": ");
		}
		println("Average is: " + k/5);
	}
	
	private void ques5() {
		double k = nextDouble("Enter number 1: ");
		for (int i = 2; i <= 5; i++) {
			k = Math.max(k, nextDouble("Enter number " + i + ": "));
		}
		println(k);
	}
	
	private void ques6() {
		double k = nextDouble("n: ");
		double l = 1;
		for (int i = 2; i <= k; i++) {
			l *= i;
		}
		println(l);
	}
	
	private void ques7() {
		double a = 1;
		double b = 1;
		double c;
		int n = nextInt();
		if (n <= 2) {
			println(n);
		} else {
			n -= 2;
			for (int i = 0; i < n; i ++) {
				c = b;
				b = a + b;
				a = c;
			}
			println(b);
		}
	}
	
	private void ques8_1() {
		String s = nextLine();
		for (int i = s.length(); i > 0; i--) {
			println(s.substring(0, i));
		}
	}
	
	private void ques8_2() {
		String s = nextLine();
		for (int i = 0; i < s.length(); i++) {
			println(i);
		}
	}
	
	private void ques8_3() {
		String s = nextLine();
		for (int i = 0; i < s.length(); i++) {
			println(mulStr(" ", i) + s.substring(i, s.length()));
		}
	}
	
	private void ques9() {
		for (int i = 0; i < 20; i++) {
			println(Math.random() * 101);
		}
	}
	
	private void ques10() {
		int guess;
		int secret = (int) (Math.random() * 100) + 1;
		while ((guess = nextInt("Guess a number:")) != secret) {
			if (guess < secret) {
				println("Too low, guess again");
			} else {
				println("Too high, guess again");
			}
		}
		println("You are right");
		
	}
	
	private void ques11() {
		int intNumber;
		int intNumberOn;
		intNumber = nextInt();
		for (intNumberOn = 1; intNumberOn <= intNumber; intNumberOn++) {
			if (intNumber % intNumberOn == 0) {	
				println(intNumberOn);
			}
		}
	}
	
	private void ques12() {
		String s;
		while (!(s =nextLine()).equals("stop")) {
			boolean trueOrFalse = false;
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					trueOrFalse = true;
					break;
				}
			}
			if (trueOrFalse) {
				println("N");
			} else {
				println("Y");
			}
		}
	}
	
	private void ques13() {
		String s;
		while (!(s = nextLine()).equals("stop")) {
			int v = 0;
			int c = 0;
			s = s.toLowerCase();
			for (char k: s.toCharArray()) {
				if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
					v ++;
				} else {
					c ++;
				}
			}
			println("vowels: " + v);
			println("consonants: " + c);
		}
	}
	
	private void ques14() {
		String[] numbers = new String[]{
			"zero", "one", "two", "three", "four", "five", "six",
			"seven", "eight", "nine"
			};
		String strIn = nextLine();
		for (char i: strIn.toCharArray()) {
			print(numbers[Integer.parseInt(String.valueOf(i))] + " ");
		}
	}
	
	private void ques15() {
		for (int i = 0; i < 10; i++) {
			clear();
			println(mulStr(" ", i) + "*");
			sleep(1000);
		}
	}
	
	private static String mulStr(String a, int i){ 
		StringBuilder builder = new StringBuilder();
		while (i > 0) {
			builder.append(a);
			i--;
		}
		return builder.toString();
	}
}
