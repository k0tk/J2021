package tast;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in) ;
//		System.out.println("******************** TASK #0 *****************");
//		System.out.println("Enter integer:");
//		int i = sc.nextInt();
//		
//        if (i >= 0) {
//        	System.out.println("Your number is positiv");
//        }else {
//        	System.out.println("Your number is negative");
//        }
        
        
//		System.out.println("******************** TASK #1 *****************");
//		System.out.println("Enter A:");
//        int a1 = sc.nextInt();
//		System.out.println("Enter B:");
//        int b1 = sc.nextInt();
        
//		System.out.println("******************** TASK #2 *****************");
//		System.out.println("Enter A:");
//		int a = sc.nextInt();
//		System.out.println("Enter B:");
//		int b = sc.nextInt();
//		System.out.println("Enter C:");			
//        int c = sc.nextInt();
//        int max;
//        if (a<b && b<c) {//a1<b1<c1
//            System.out.println("The biggest number is: " + c);
//        } else if (a<b && b>c) {
//            System.out.println("The biggest number is: " + b);
//        } else if (a>b && b>c) {
//            System.out.println("The biggest number is: " + a);
//        }
//		
//        if (a>b) {
//        	max = a;
//        }else {
//        	max = b;
//        }
//        
//        if(max > c) {
//        System.out.println("MAX is " + max);
//	}else {
//		System.out.println("MAX is "+ max);
//	}
        
//		System.out.println("******************** TASK #3 *****************");
//		System.out.println("Enter s:");	
//        double s = sc.nextDouble();
//        System.out.println("Enter t:");	
//	    double t = sc.nextDouble();
//	    if (s>0 && t > 0) {
//	    double v = s/t;
//	    System.out.println("V = " +v);
//	    }else {
//	    	System.out.println("wrong input data. Range is" + s + "Time is"+ t);
//	    }
//		System.out.println("******************** TASK #4 *****************");
//		System.out.println("Темпнратура воды");
//		 double tw =sc.nextDouble();
//		 double perSecond = 7 / 1.5;
//		 double leftTemp = 100 - tw;
//		 double leftSeconds = leftTemp /perSecond;
//		 System.out.println("Left Second" + leftSeconds);
			System.out.println("******************** TASK #5 *****************");

		 int num = 9;
		 double u = Math.sqrt(num);
		 System.out.println(u);
		
		 System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();
			System.out.println("Enter C:");			
	        int c = sc.nextInt();
		int D = (b*b)-4*a*c;
		double x = -b/(2*a);
		double x1 = (-b+Math.sqrt(D))/2*a;
		double x2 = (-b-Math.sqrt(D))/2*a;
		if (D<0) {
			System.out.println("нет корней");
		}else if ( D==0 ) {
			System.out.println("имеет 1 корень X=" + x );
			
		}else if (D>0) {
			System.out.println("имеет 2 корня:X1=" +x1+ "X2= " +x2 );
		}
		

	    
	}
}
