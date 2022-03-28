package by.itstep.model;

public class Cat {

	public String color;
	public String breed;
	public String Gender;
	public int years;
	public String name;
	/**
	 * methods.
	 * методы.Поведения каждого индевидуфльного объекта типа Cat
	 */
	public void sleep() {
		System.out.println( name + " Cat is sleeping");
				
		
	}
	public void eat() {
		System.out.println(name +  " Cat is eating");
	}
	public void voice() {
		System.out.println( name + " :meow - meow");
	}
	public void play() {
		System.out.println( name + " Cat is playing");
	}
}
