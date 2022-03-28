package by.itstep.model.Task.empls;

public class EmplesTester {

	public static void main(String[] args) {
		Emplyee e1 = new Emplyee();
		e1.setName("bob");
		e1.makeJob();
		
		Developer d1 = new Developer();
		d1.setName("John");
		d1.makeJob();
		d1.code();
		
		SeniorDeveloper sd1 = new SeniorDeveloper();
		sd1.setName("Bill");
		sd1.setAge(25);
		sd1.setGender('m');
		sd1.setCompanyName("IBM");
		sd1.setDepartament("Developer departament");
		sd1.setPosition("Developer lvl 5" );
		sd1.setLastName("Ivanov");
		sd1.setExp(5);
		sd1.makeJob();
		sd1.code();
		System.out.println(sd1.toString());
		
		JuniorDeveloper j1 = new JuniorDeveloper();
		j1.setName("Thom");
		j1.makeJob();
		j1.code();
		
		MiddleDeveloper m1= new MiddleDeveloper();
		m1.setName("Artur");
		m1.makeJob();
		m1.code();
		m1.dontdance();
		TestDeveloper td1= new TestDeveloper();
		td1.setName("maks");
		td1.makeJob();
		td1.testCod();
		JuniorTestDeveloper jtd1= new JuniorTestDeveloper();
		jtd1.setName("alex");
		jtd1.makeJob();
		jtd1.testCod();
		jtd1.dontdance();
		
		Mnager mn1= new Mnager();
		mn1.setName("koly");
		mn1.makeJob();
		mn1.mang();
		mn1.dontdance();
		
		Student st1 = new Student();
		st1.setName("Maks");
		st1.studies();
		st1.dance();
		Sophomore sp1= new Sophomore();
		sp1.setName("Vlad");
		
		
		sp1.dance();
		
		
		
		System.out.println(sd1.toString());
		Person p1 = new Person();
		p1.setName("Maks");
		p1.setLastName("Ivanov");
		p1.setGender('m');
		p1.setAge(18);
		p1.dance();
		System.out.println(p1.toString());
		
	}

}
