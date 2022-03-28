package by.itstep.client;

import by.itstep.model.Car;

public class AutoHaus {

	public static void main(String[] args) {

		//creating objects ( instances of the class)
		// object <=> Intanses - коннкретный объект созданный на основе класса
		Car car ;
        // give me new object "Car"
		car = new Car();
		
		car.color = "black";
		car.model = "BMW 5";
		car.hp = 250;
		car.prisce=75000;
		car.sizeOfWheel = 18;
		car.type = "S Class";
		
		Car car2 = new Car();		
		car2.color = "Wite";
		car2.model = "Audi A3";
		car2.hp = 200;
		car2.prisce=45000;
		car2.sizeOfWheel = 17;
		car2.type = "C Class";
		
		
		Car car3 = new Car();
		car3.color = "Yelou";
		car3.model = " Mersedes";
		car3.hp = 190;
		car3.prisce=55000;
		car3.sizeOfWheel = 16;
		car3.type = "S Class";
	}

}
