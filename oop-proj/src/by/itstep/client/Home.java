package by.itstep.client;

import by.itstep.model.Car;
import by.itstep.model.Cat;

public class Home {

	public static void main(String[] args) {
		Cat  cat;
		
		cat = new Cat();
		
		cat.breed = "shorthaired";
		cat.color = "grey";
		cat.Gender = "boy";
        cat.name = "Markiz";
        cat.years = 8;
        
        Cat cat2 = new Cat();
		
        cat2.breed = "fluffy";
		cat2.color = "Blakc";
		cat2.Gender = "boy";
        cat2.name = "Maks";
        cat2.years = 4;
	
		cat.eat();
		cat.play();
		cat.sleep();
		
		cat2.play();
		cat2.eat();
		cat2.sleep();
		
		
	}

}
