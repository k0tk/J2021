package by.itstep.model.Task.empls;

public class Student extends Person {
	public void studies () {
		System.out.println("teaches subject");
	}
	@Override
	public void dance() {
		drink(3);
		super.dance();
	}
	@Override
	public void drink() {
		System.out.println("Student "+getName()+ " drink bear");
	}
	public void drink(int num) {
		for (int i = 0; i < num; i++) {
			drink();
		}
	}

}
