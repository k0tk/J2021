package by.itstep.client;

import by.itstep.model.Car;
import by.itstep.model.Cat;
import by.itstep.model.Person;

public class Human {

	public static void main(String[] args) {
		
     Person p = new Person();
     
     p.setAge(17);
     p.setName("Maks");
     p.setLastName("Johnson");
     p.setGender('m');
     
     Car car = new Car();
     car.color ="Rad";
     car.model = "BMW Z3";
     
     p.setCar(car);
     Cat cat=new Cat();
     cat.name ="Rambo";
     cat.years =5;
     
     p.cat =cat;
	}

}
