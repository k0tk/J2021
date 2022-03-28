package by.itstep.model.Animals;

public class Cat extends Mammal{
	public void play() {
		System.out.println("Cat "+ this.getName()+" is plaining");
	}
	private String slep;

	public String getSlep() {
		return slep;
	}

	public void setSlep(String slep) {
		this.slep = slep;
	}

}
