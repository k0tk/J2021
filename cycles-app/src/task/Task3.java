package task;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
System.out.println("Введите число:");
		int num = sc.nextInt();
		int counter = 1;
		if(num % 2==0) {
			System.out.println("Четное");
			counter =counter +1;
		}else {
			System.out.println("Не четное");
		}
		
			
		
		int i = 3 ;
		while (i<=10) {
			if(num % i == 0) {
				System.out.println("Кратное "+i);
				counter =counter +1;
				
			}
			i=i+1;
		} if(num<0) {
			System.out.println("Отрицательный ");
		} if(num>0) {
			System.out.println("Положительный");
		}
			
		
		if(counter>2) {
			System.out.println("Не простое число ");
		}else {
			System.out.println("Простое число ");
		}
		
		
		
	}

}
