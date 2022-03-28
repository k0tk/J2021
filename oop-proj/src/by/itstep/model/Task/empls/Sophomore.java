package by.itstep.model.Task.empls;

public class Sophomore extends Student {
	public void stud () {
		System.err.println("asks the machine");
	}
	public void dance() {
		drink(2);
		super.dance();
	}
	public void drink() {
		System.out.println("Student "+getName()+ " drink vodka");
	}
	public void drink(int num) {
		for (int i = 0; i < num; i++) {
			drink();
		}
	}
}