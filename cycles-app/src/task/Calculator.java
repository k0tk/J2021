package task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
			
		System.out.println("Input A:");	
		int a = sc.nextInt();
		System.out.println("Input B:");
		int b = sc.nextInt();
        
        
			
		
        int c1 = a+b;
        int c2= a*b;
        int c4 = a-b;
        if(b != 0) {
        double c3 =(double) a/b;
        System.out.println("A / B = " + c3);
	} else {
		System.out.println("Division by Zero invalid " );
	}
        
       
        System.out.println("A + B =" + c1);
        System.out.println("A * B =" + c2);
        System.out.println("A - B =" + c4);
      
        
        
        
        
	}

}
