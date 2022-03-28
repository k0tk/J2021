package by.itstep.model.Task.empls;

public class Developer extends Emplyee {
	
//	private String companyName;
//	private String position;
//	private String departament;
	@Override
	public String toString() {
		
		return super.toString() +"Company name: "+ getCompanyName()+ ", position: "+getPosition() +",Depornament: "+ getDepartament();
	}
	
	
	
	public void code() {
		System.out.println("write some code...");
	}

}
