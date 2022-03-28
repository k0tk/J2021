package task;

import java.util.Scanner;

public class Taibl {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("¬ведите число:");
		int a = sc.nextInt();
		System.out.println("¬ведите множитель:");
		int b = sc.nextInt();


//		int n1 = 1*a;
//		System.out.println("1 * " +a+" = " + n1);
//		int n2 = 2*a;
//		System.out.println("2 * " +a+" = " + n2);
//		int n3 = 3*a;
//		System.out.println("3 * " +a+" = " + n3);
//		int n4 = 4*a;
//		System.out.println("4 * " +a+" = " + n4);
//		int n5 = 5*a;
//		System.out.println("5 * " +a+" = " + n5);
//		int n6 = 6*a;
//		System.out.println("6 * " +a+" = " + n6);
//		int n7 = 7*a;
//		System.out.println("7 * " +a+" = " + n7);
//		int n8 = 8*a;
//		System.out.println("8 * " +a+" = " + n8);
//		int n9 = 9*a;
//		System.out.println("9 * " +a+" = " + n9);
//		int n10 = 10*a;
//		System.out.println("10 * " +a+" = " + n10);
		
		int i = 1;
		while (i<=b) {
			System.out.println(i + " * " +a+ " = " + (i* a));
			i=i+1;
			
			
		}
		System.out.println("Reverse order:");
		while (b>0) {
			System.out.println(b + " * " +a+ " = " + (b* a));
			b=b-1;
		}
	}

}
