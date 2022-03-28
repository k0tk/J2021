package by.itstep.model.Task.empls;

public class Person {
	private String name;
	private String LastName;
	private int age;
	private char gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String str ="Name : "+name+" ,Last name: "+LastName+" ,Age:"+ age+ " ,Gender:" +gender; 
		return str;
		
		
		}
		public void dance() {
			System.out.println(name+" danceing");
	}
		public void dontdance() {
			System.out.println(name+" not danceing");
		}
		public void drink() {
			System.out.println(name+" Drink");
		}

}
