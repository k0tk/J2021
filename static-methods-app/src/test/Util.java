package test;

import java.util.Scanner;

public class Util {
	Scanner sc = new Scanner (System.in) ;
	/**
	 * Methods(functions). Спомобность обьявить несколько инструкции 1 именем - именем методом .
	 * Методы могут возрощать  значени или возрощать ничего 
	 * Void - Указывает на то что метод ничего не возрощает
	 * <...> <type of method> <method_name>(<parametrs>){<method body}
	 * 
	 */
	static void printHello() {
		printText("Hello from static method!",1);
	//	System.out.println("Hello from static method!");		
	}
	//(param 1, param2 ... param3
	 static void printText(String text, int num) {
		 for( int i = 0;i<num ; i++)
			 System.out.println(text);
	 }
	 static void isMilt(int base,int num) {
		if(base % num == 0) {
			System.out.println(base +" Кратен "+ num);
		}else {
			System.out.println(base +" не Кратен "+ num);
		}				
 }
	
	 static int summa(int a, int b) {
		 int s= a+b;
		 
		 System.out.println("summa is :" + s);
		 return s;
		 
	 }  static double dif(double a, double b) {
	        if(b == 0) {
	            System.out.println("Error: div by Zero");
	            throw new IllegalArgumentException("Wrong input");
	        } else {
	            return a / b;
	        }
	    
		 
	 }static int mount(int a, int b) {
		 int s= a*b;
		 
		 System.out.println("mount is :" + s);
		 return s;
		 
	 }static int mins(int a, int b) {
		 int s= a-b;
		 
		 System.out.println("mins is :" + s);
		 return s;
		 
	 }static void ves (int a ) {
		 if(a%4!=0) {
			 System.out.println(" Не Високосный год");
		 }else {
			 if(a % 100 == 0 && a % 400 !=0) {
			 System.out.println("Не Високосный год");
		 }else {
			 System.out.println("Високосный год");
		 }
		 
	 }
	 }
	 static long factorial(int n ) {
		 long result =1;
		 for(int i=1;i<=n;i++) {
			 result = result * i;
		 }
		return result;
	 }
	 static void m1(int n) {
		 
		 for (int i=1;i<=n;i++) {
			 if(i==n) {
//				 System.out.print(i+ ".\n");
//			 }else {
//				 System.out.print(i+ ", ");
			 }
                                //<condition>?<expression_1>:<expression_2>			 
			 System.out.print(i+(i==n? ".\n" : ","));
		 }
		 }
		 static int getMax(int x,int y,int z) {
				return x>y?(x>z? x : (y>z? y:z)) : y>z? y : z ;
	 }
		 static int getMin(int x,int y,int z) {
				return x<y?(x<z? x : (y<z? y:z)) : y<z? y : z ;
	 }
		 static double getAvg(int x,int y,int z,int v ,int c ) {
			 return (double)( x+y+z+c+v) / 5;
		 }
	 
		 static int change(int x) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Что вы хотите сделать? ");
		        System.out.println("Найти: 1 - max, 2 - min, 3 - avg");

		        int answer = sc.nextInt();

		        switch (answer) {
		        case 1:
		            System.out.println("Input numbers");
		            int a = sc.nextInt();
		            int b = sc.nextInt();
		            int c = sc.nextInt();
		            System.out.println("Мax is: " + getMax(a, b, c));
		            break;

		        case 2:
		            System.out.println("Input numbers");
		            int a1 = sc.nextInt();
		            int b1 = sc.nextInt();
		            int c1 = sc.nextInt();
		            System.out.println("Min is: " + getMin(a1, b1, c1));
		            break;

		        case 3:
		            System.out.println("Input numbers");
		            int a2 = sc.nextInt();
		            int b2 = sc.nextInt();
		            int c2 = sc.nextInt();
		            int v = sc.nextInt();
		            int p = sc.nextInt();
		            System.out.println("avg is: " + getAvg(a2, b2, c2, v, p));

		            break;

		        default:
		            System.out.println("No such impltmentation for case.");
		            break;
		        }

		        if (answer == 1) {
		        } else if (answer == 2) {

		        } else if (answer == 3) {
		        }
		        return answer;
		    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
