package by.itstep.model.Animals;

public class AnimalsTester {

	public static void main(String[] args) {
		PetCat pcat = new PetCat();
		pcat.setColor("Blac");
		pcat.setName("Markis");
		pcat.setWeight(9);
		pcat.play();
		pcat.eat();
		pcat.sleep();
		
		Wild wcat = new Wild();
		wcat.setColor("Wite");
		wcat.setName("Tom");
		wcat.attack();
		wcat.eat();
		wcat.sleep();
		
		Sparrow s = new Sparrow();
		s.setName("Боря");
		s.fly();
		s.steal();
		
		Eagle e = new Eagle();
		e.setName("Коля");
		e.fly();
		e.hunt();
	}

}
