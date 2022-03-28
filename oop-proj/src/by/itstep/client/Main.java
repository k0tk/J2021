package by.itstep.client;

import by.itstep.model.Address;
import by.itstep.model.Company;
import by.itstep.model.Employee;

public class Main {

	public static void main(String[] args) {
		Company c1 = new Company();
		Company c2 = new Company();
		// c1.name = "ItStep";
  
		c1.setName("ItStep");
		c1.setType("IT");
		c1.setNumberOfEmpls(500);
		c1.setPhone("+375445634576");
		c1.setLocatoin("Minsk");
		c1.setBudget(100500);
		System.out.println(c1.getBudget());
		System.out.println(c1.getPhone());
		System.out.println(c1.getLocatoin());		
		System.out.println(c1.getType());
		System.out.println(c1.getName());
		System.out.println(c1.getNumberOfEmpls());
		
		
		
		c2.setName("IBM");
		c2.setType("IT");
		c2.setNumberOfEmpls(400);
		c2.setPhone("+375445634576");
		c2.setLocatoin("Брест");
		c2.setBudget(100400);
		System.out.println(c2.getBudget());
		System.out.println(c2.getPhone());
		System.out.println(c2.getLocatoin());		
		System.out.println(c2.getType());
		System.out.println(c2.getName());
		System.out.println(c2.getNumberOfEmpls());
		
		Address c3 = new Address();
	
		
		
		Employee e1 = new Employee();
		e1.setName("bob");
		e1.setId(552);
		e1.setCompany(c1);
		Employee e2 = new Employee();
		e2.setCompany(c2);
		Employee e3 = new Employee();
	}

}
