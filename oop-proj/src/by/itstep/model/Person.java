package by.itstep.model;

/**
 * 
 * SUPER class. Top lvl class. Parent class.Super Type 
 *
 */
public class Person {
 
	private String name;
	private String lastName;
	private int age;
	private char gender ; //can be 'f' , 'm'
	private  Car car; // has a relation ship to "CAR" model
	public  Cat cat; // has a relation ship to "CAT" model
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
