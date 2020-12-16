package course;
import arc.*;
import template.*;
public class CourseLoop extends CourseClassFormat {
	
	@Override
	public void run() {
		forLoop();
	}
	
	public void whileLoop() {
		double dblMoney = 0;
		
		while (dblMoney < 1000) {
			double dblDeposite = nextDouble("How much money do you want to deposite? ");
			dblMoney += dblDeposite;
			println("Now, you have", dblMoney, "dollars");
		}
	}
	
	public void forLoop() {
		for (char i = '0'; i < 10; i++) {
		}
	}
	
}
