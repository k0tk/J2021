package utill;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * This class provide basic operations ith an Arrays
 * @author Maks
 * @since v.19
 */
public class ArraysUtil {
	Scanner sc = new Scanner (System.in) ;
	/**
	 * print specified array. The print way can be regulated via flag.
	 * @param arr - incoming array
	 * @param inLine - the way of printing 
	 */
	 public static void printArray(int arr[], boolean inLine) {
	        for(int index = 0; index < arr.length; index++) {
	            if(inLine) { // arr = {1, 2, 3}
	                if(index == 0) { // if it's fist element
	                    System.out.print("arr = {" + arr[index] + (arr.length ==1?"}\n": ", "));
	                } else if(index == arr.length - 1) {
	                    // if it's last element
	                    System.out.print(arr[index] + "}\n");
	                } else {// if it's an middle element
	                    System.out.print(arr[index] + ", ");
	                }
	            } else { // arr[0] = 1; 
	                     // arr[1] = 2; ...
	                System.out.println("arr[" + index + "] = " 
	                     + arr[index] );
	            }
	        }
	 }
	 /**
	  * Print specified array in single line .
	  * @param arr
	  */
	        public static void printArray(int arr[]) {
	   printArray(arr, true);
	        
	    }
	    public static int[] getRandomArray(int size) {
	    	int [] arr = new int[size];
	    	//populate array
	    	for (int i = 0; i < arr.length; i++) {
				
				int value =(int)(Math.random()* 101);
				if((int)(Math.random()* 2) ==1) {
					value = value * (-1);
				}
					arr[i] =value;
				}
			

			
	    	return arr;
	    }
	    public static int[] arraysCopy (int original[],int extra) {
	    	int[] array = new int [original.length +extra];
			
			for (int i = 0; i < original.length; i++) {
				array[i] = original[i];	
			}
			return array;
	    }
      public static double findAVG(int arr[]) {
    	  
    	  double summa = 0;
    	  for (int i = 0; i < arr.length; i++) {
			summa = summa + arr[i];
			
		}
    	  double avg = summa / arr.length;
    	  return avg;
      }
    
      /**
       * find MAX or MIN from incoming Array
       * @param arr
       * @param dir - direction flag; true - MAX,False - MIN
       * @retutn
       */
      public static int findVal(int[] arr,boolean dir) {
    	  int temp = arr[0];// assume that 1st is maximum
    	  for (int index = 1;index <arr.length;index++) {
    		  if(dir? temp <arr[index] : temp > arr[index]) {
    			
    			  temp = arr[index];
    	  }
    	  }
    	  
     	 return temp;
}
      public static int findVal(int[] arr) {
    	  return findVal(arr,true);
      }
   // sort array ASC, DESC
      public static void sort(int a[], boolean asc) {
          //arr = { 1, -2, -3, 7, -3}
          for (int i = 0; i < a.length; i++) {
              //1.  assume that 1st is minimum. also hold index
              int elem = a[i];
              int index_elem = i;
              //2. left elements
              for (int j = i + 1; j < a.length; j++) {
                  if(asc? a[j] < elem : a[j] > elem) {
                      elem = a[j];
                      index_elem = j;
                  }
              }
              //3. Swap
              if(i != index_elem) {
                  int t = a[i];
                  a[i] = a[index_elem];
                  a[index_elem] = t;
              }
          }
      
      }
      public static void bubleSort(int[] arr) {
    	  // внешний цикл реализует сокращени элементов с конца 
    	  for (int i = arr.length - 1; i > 0; i--) {
    		  //внутрений цикл бут отбрасывать макс значение в конец
    		  for(int j = 0; j < i; j++) {
    			//поппарное сравнение. В случаи неправильного порядка меняем их между собой
    			  if (arr[j] >arr[j +1]) {
    				  int t = arr[j];
    				  arr[j] =arr[j +1];
    				  arr[j +1] =t;
    			  }
    		  }
    	  
		}
      }
      public static void bubleSortMin(int[] arr) {
    	  // внешний цикл реализует сокращени элементов с конца 
    	  for (int i = arr.length - 1; i < 0; i++) {
    		  //внутрений цикл бут отбрасывать макс значение в конец
    		  for(int j = 0; j > i; j--) {
    			//поппарное сравнение. В случаи неправильного порядка меняем их между собой
    			  if (arr[j] <arr[j +1]) {
    				  int t = arr[j];
    				  arr[j] =arr[j +1];
    				  arr[j +1] =t; 
  }
    		  }
    	  }
      }
      
      public static int[]  mixArr (int[] arr) {
    	int temp[]= new int[arr.length];
    	int indexes[]= new int[arr.length];// to hold indexes
    	for (int i = 0; i<indexes.length ;i++) {
    		indexes[i] = - 1;
    	}
    	
    		for (int i = 0; i<temp.length ;i++) {
    			int randomIndex = (int) (Math.random() * arr.length);
    			//first check indexes
    			//if random index aready was generated then generate
    			//new one
    			
    			for (int j =0 ; j< indexes.length;j++) {
    				 
    					while(indexes[j] == randomIndex) {
    					 randomIndex = (int) (Math.random() * arr.length);
    				}
    					indexes[j] = randomIndex;
    					break;
    			}
    		temp[i] = arr[randomIndex];	
    		}
    		arr =temp;
    		return temp;
    	}
      public static int[] getReverseArray(int originalArray[]) {
          int[] newArray = new int[originalArray.length];
          for (int i = originalArray.length - 1, r = 0; i >= 0; i--, r++) {
              newArray[r] = originalArray[i];

          }
          return newArray;
      }

      //1. вывести сумму первого и последнего значения массива
      public static int t001(int arr[]) {
    	
    	 int v =arr[arr.length-1];
    	  int v1 = arr[0];
    	  int summ = v + v1;
		return summ;
		
      }
      public static int[] t002(int arr[]) {
    	 for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				
				System.out.print(arr[i]+ "," );
			}
			
		}
    	 
		return arr;
    	  
      }
    
      
//      Элементы массива, которые больше предыдущего
      
//
//      Разделить элементы массива на максимальный
//
//      Первый положительный элемент массива
//
//      Заменить элементы массива на противоположные
//
//      Поменять местами минимальный и максимальный элементы массива
//
//      Найти разность между максимальным и минимальным элементами массива
//
//      Найти сумму четных отрицательных элементов массива
//
//      Минимальный из элементов массива с нечетными индексами
//
//      Вывести элементы массива, которые больше среднего арифметического
//
//      Сумма положительных элементов массива
//
//      Найти количество положительных элементов массива
//
//      Расстояние между точками в n-мерном пространстве
//
//      Сформировать массив B из положительных элементов массива A, имеющих четный индекс
//
//      Найти среднее арифметическое отрицательных элементов массива. Заменить на него минимальный элемент.
//
//      Определить индексы элементов массива, значение которых лежит в указанном пределе
//
//      Максимальный по модулю элемент массива
//
//      Среднее арифметическое всех чётных элементов массива, стоящих на нечётных местах
//
//      Сумма элементов частей массива
//
//      Сумма и произведение элементов одномерного массива
      }


