package test;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Begin client job");
          // wsing Utill methods
		//static method invocation(run)
//		System.out.println("Input TExt please:");
//		String txt = sc.next();
//		System.out.println("Input Number(integer) please:");
//		int counter = sc.nextInt();
//		 Util.printHello();
//			Util.printText(txt,counter);
//         Util.isMilt(10, 2);
//         int sum=Util.summa(8, 3);
//         int mount=Util.mount(4, 9);
//         double dif=Util.dif(5, 6);
//         int mins=Util.mins(8, 3);
//		System.out.println("Cline sum is "+ sum);
//		System.out.println("Cline mount is "+ mount);
//		System.out.println("Cline dif is "+ dif);
//		System.out.println("Cline mins is "+ mins);
//		 Util.ves(1988);
      

	    long factor = Util.factorial(5);
	    System.out.println("factrial = " +factor);		
	    		

	    Util.m1(9);
	    
	    Util.change(1);
	    
	    int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int v = (int) (Math.random() * 100);
	    
	    
	     
	}
	
			

}
