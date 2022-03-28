package org.itistep.test.var;

public class VarTester {

	public static void main(String[] args) {
		long p2 =11111111111l;
		byte u = -128; // -128 .. 127
		
		int i;
		double d = 3.3;
		char c ='A' ;
		boolean bool = true;// can be 'true' or 'false' 
		bool = false;
		
		int m1 = 10;
		int m2 = 9;
		int m3 = 7;
		int m4 = 5;
		int m5 = 8;
		double avg = (m1 + m2 +m3 + m4 + m5) / 5.0;
		System.out.println("AVG = " + avg);
		
		double dollar= 2.46*1.2 , evro =2.85*1.2 , cash = 50000.0, RUS=3.443 /100 * 1.2  ;
		double dollar1 = cash / dollar ; // amaount in usd
		double evro1 = cash / evro ; // amount in evro 
		double RUS1 = cash/ RUS ;// amount in RUS
		System.out.println("BYN:" + cash);
		System.out.println("USD: "+ dollar1);
		System.out.println("EVRO:" +evro1 );
		System.out.println("RUS:"+ RUS1);
		
		
		short y =6, x = 8, z =10, r=10 ;
		double n=3.14;
		 
		int P = x +y + z;
		double  p = (x +y + z)/2.0;
		double S= 0.5*y*x;
		double S3= n *(r*r);
		double circle = 2*n*r ;
		double S2 = Math.sqrt(p*(p-y)*(p-x)*(p-z));
		System.out.println("S2=" +S2 );
		System.out.println("Площадь=" + S );
		System.out.println("длина окружности ="+ circle );
		System.out.println("площадь круга ="+ S3 );
		System.out.println("периметр="  + P );
		System.out.println("Полу-периметор=" + p);
		
		
				
	}
}
