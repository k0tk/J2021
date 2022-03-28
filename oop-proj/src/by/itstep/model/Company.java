package by.itstep.model;

public class Company {

	private String type;
	private String name;
	private int numberOfEmpls;
	private double budget;
	private String locatoin;
	private String phone;
	
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getLocatoin() {
		return locatoin;
	}
	public void setLocatoin(String locatoin) {
		this.locatoin = locatoin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name; // this - указывает на объект в коценте класса
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		
	}
	
	public int getNumberOfEmpls() {
		return numberOfEmpls;
	}
	public void setNumberOfEmpls(int numberOfEmpls) {
		this.numberOfEmpls = numberOfEmpls;
		
	}
	
	
	
	

	
	
	
	
}
