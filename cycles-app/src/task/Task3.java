package task;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
System.out.println("������� �����:");
		int num = sc.nextInt();
		int counter = 1;
		if(num % 2==0) {
			System.out.println("������");
			counter =counter +1;
		}else {
			System.out.println("�� ������");
		}
		
			
		
		int i = 3 ;
		while (i<=10) {
			if(num % i == 0) {
				System.out.println("������� "+i);
				counter =counter +1;
				
			}
			i=i+1;
		} if(num<0) {
			System.out.println("������������� ");
		} if(num>0) {
			System.out.println("�������������");
		}
			
		
		if(counter>2) {
			System.out.println("�� ������� ����� ");
		}else {
			System.out.println("������� ����� ");
		}
		
		
		
	}

}
