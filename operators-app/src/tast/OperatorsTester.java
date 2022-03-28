package tast;

public class OperatorsTester {

	public static void main(String[] args) {
		boolean flag = true; // can be 'true' or 'false'
		System.out.println("flag now is " + flag);

		int iq = 150;
		boolean isSmart;
		// if (<condition>) {<operator1>; <operator2>; ... }
		if (iq > 50) {
			isSmart = true;
		} else {
			isSmart = false;// if iq < 50 or iq ==50

		}
		System.out.println("Person is Smart " + isSmart);

		int cash = 100000000;
		boolean isRich;
		if (cash > 1000000) {
			isRich = true;
		} else {
			isRich = false;

		}
		System.out.println("Person is mycash? " + isRich);
		boolean isKind = true;
		
		if((isRich && isSmart) || isKind) { 
			System.out.println("Yes!");
		}else {
			System.out.println("No");		
		}

		int t = -65;
		if(t>20) {
			System.out.println("T-shirt");
			
		}else if (t>=10) {
			System.out.println("Jacket");
			
		}else if(t>=-30) {
			System.out.println("coat");
		}else  {
			System.out.println("stay at home");
		}
		int age=80;
		if (age <6 ) {
		System.out.println("kindergarde" );
	}else if(age<18) {
			System.out.println("shool");
			
		}else if (age<27) {
			System.out.println("Army");
		}else if (age<65) {
			System.out.println("work");
			
		}else {
			System.out.println("pension");
		}
		
		   double avg = 5.5;
	        if (avg > 10 || avg < 0) {
	            System.out.println("try again");
	        } else if (avg < 4) {
	            System.out.println("so bad");
	        } else if (avg < 6.5) {
	            System.out.println("soso");
	        } else if (avg < 8) {
	            System.out.println("good");
	        } else if (avg >= 8) {
	            System.out.println("OMG");
	        }
	        
	        if (iq>=100 || cash>500 || t < 20 || age != 20 || avg == 5 || !isKind && flag == false) {
	        	System.out.println("!!!");
	        	
	        }
	        if(avg ==5.5) System.out.println("!!!");
		
			
				 
		
	}

}
