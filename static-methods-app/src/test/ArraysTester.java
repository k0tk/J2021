package test;

public class ArraysTester {

	public static void main(String[] args) {
        // single dimension arrays       
		int arr1[];
		
		
		// multiple dimension arrays   
		int [][] matrix;
		int [][] tripleArray[];
	    //Arrays int
		//Index: 0  1  2  3  4  5  6  7  8  9		
		//Value:{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} 
		arr1 = new int[10];//создать объект целых чисел размер 10 при этом кажда€ из €чеек будет ицелезировано в дефолтное значение
	
                   //0 1 2		
		int[]arr2 = {2,3,4,46}; // создано 3 €чейки в массиве и они заполнены
		//GET value by INDEX
		int val = arr2[1];
		System.out.println(val);
		int v = arr2[3];
		System.out.println(v);
		//SIZE <=> length –азмерность массива - всегда строго количеству €чеек
		int size2 = arr2.length;
		System.out.println("Size jf array #2:"+ size2);
		int size1 = arr1.length;
		System.out.println("Size jf array #1:"+ size1);
		
		// set value
		arr1[9]=99;
		
		//get last element
		int lastVal1 =arr1[arr1.length -1]; //'arr1.length - 1' - last
		System.out.println("Last value jf array #1: " +lastVal1);
		System.out.println("Last value jf array #2: " +arr2[arr2.length -1]);
		
		//
		for(int i = 0; i<arr2.length; i++) {
			int value =arr2[i];
			System.out.println("Array["+i+"] = " + value);
		}
		//'for each'
		//for(<type> temp_var : <iterable structure>){<body>}
		for(int val2 : arr1) {
			System.out.println(val2);
		}
		
	}

}
