package test;


import static utill.ArraysUtil.*;
import static utill.ArraysUtil.findAVG;
import static utill.ArraysUtil.findVal;
import static utill.ArraysUtil.getRandomArray;
import static utill.ArraysUtil.printArray;
import static utill.ArraysUtil.sort;

import utill.ArraysUtil;

public class Client2 {


	
	
	public static void main(String[] args) {
		int array[] = {3,4,-5,1,22,99};
		ArraysUtil.printArray(array);
		
		int array2[] = {3};

        printArray(array2);
		
		int array3[] = new int[0];
		printArray(array3);
        
		int array4[] =getRandomArray(100);
		int array5[] =new int [100];
		printArray(array4);
		
		
	
		
		printArray(getRandomArray(50));
		
		System.out.println("Original:");
		int[] arr5 = getRandomArray(10);
		printArray(arr5);
		
		
		System.out.println("New:");
		printArray(arraysCopy(arr5,5));
		System.out.println(findAVG(arr5));
		
		int t[] = {21,-33,22,-66,19};
		int max = findVal(t);
		System.out.println("MAX is " + max);
		int min = findVal(t, false);
		System.out.println("MIN is " + min);
		
		System.out.println("****Sorting*****");
		int arr[] = getRandomArray(20);
		System.out.println("BEFORE:");
		printArray(arr);  
		sort(arr , false);
		System.out.println("AFTER:");
		printArray(arr);
		
		System.out.println("****Buble Sorting*****");
		
		System.out.println("BEFORE:");
		 arr = getRandomArray(20);
		printArray(arr);  
		System.out.println("AFTER:");
		bubleSort(arr);
		printArray(arr);
		System.out.println("****************");
		bubleSortMin(arr);
		printArray(arr);
		
		
		System.out.println("TASKS:");
		System.out.println("Mix ARRAYS.");
		int arrt1[] = getRandomArray(5);
		printArray(arrt1);
		arrt1 = mixArr(arrt1);
		printArray(arrt1);
		
		
		
		int arrays[] = {3,4,-5,1,22,99};
		int summ = t001(array);
		System.out.println( "—ÛÏÏ‡ = " + summ);
		
		System.out.println("****************");
		int[] otr =t002(arr);
		
	}

	
		
	}
	
	
	
	
	
	

	
	


