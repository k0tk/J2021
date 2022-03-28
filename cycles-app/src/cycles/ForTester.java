package cycles;

public class ForTester {

	public static void main(String[] args) {
		//(<init> -служит для обявления переменной,области видимости которых ограничевается боди.Выполняется единежды!!!  
		//<condition>-условие выполнения цикла если услвия расщитвыается в true,выполняется folse(всегда boolean
		//<operator>- любая вспомогательная операция , Затем будет происходить расщот условия . В случая отсутсвия оператооа выполяется condition (увел или уменьшение счетчика влияющий на condition
		//{<body>}-тело цикла после окончание сработет цифра 4
		//   1             2             4          3
		//for(<init>; <condition>; <operator>; {<body>}
		
		
//		
//	      for(int i = 0, bound = 100;  i<= bound ; i++) {// i++ <=> i = i+1
//	    	  if(i ==bound ) { //Последний элемент
//	    		  System.out.print(i + ". ");
//	    	  }else {
//	    		  System.out.print(i + ", ");
//	    	  }
//	    	  
//	      }
	      for(int a = 10, bound = 150;  a<= bound ; a++) {// i++ <=> i = i+1
	    	  if(a ==bound ) { //Последний элемент
	    		  System.out.print(a + ". ");
	    	  }else {
	    		  System.out.print(a + ", ");
	    	  }
	    	  
	      }
	      System.out.println("\ntask2");
	      for(int b = 100, bound = 1;  b>= bound ; b--) {// i++ <=> i = i+1
	    	  if(b ==bound ) { //Последний элемент
	    		  System.out.print(b + ". ");
	    	  }else {
	    		  System.out.print(b + ", ");
	    	  }
	    	  
	      }
	      System.out.println("\ntask3");
	      for(int i = 0, bound = -25;  i>= bound ; i--) {// i++ <=> i = i+1
	    	  if(i ==bound ) { //Последний элемент
	    		  System.out.print(i + ". ");
	    	  }else {
	    		  System.out.print(i + ", ");
	    	  }
	    	  
	      }
	      System.out.println("\ntask4");
	      for(int i = 0, j =0;i<25; i++) {// i++ <=> i = i+1
	    	 j+=2; // j = j + 2
	    	 System.out.print(j+ " ");
	    	  
	      }
	      System.out.println("\ntask5");
	      for(int i = 0, j =0;i<40; i++) {// i++ <=> i = i+1
	    	 j+=3; // j = j + 2
	    	 System.out.print(j+ " ");
	    	  
	    	  
	      }
	      System.out.println("\ntask6");
	      for(int i = 0, j =0;i<30; i++) {// i++ <=> i = i+1
	    	 j+=10; // j = j + 2
	    	 System.out.print(j+ " ");
	    	  
	    	  
	      }
		
	      System.out.println("\ntask7");
	      for(int i = 1;i<=100; i++) {// i++ <=> i = i+1
	    	  if(i%5==0){
	    		  System.out.print(i+ " ");
	    		  
	    	  }else {
	    		  System.out.print((-1)*i+ " ");

	    	  }
	    	
	      }
	      System.out.println("\ntask7.1");
	      for(int i = 0, x =0;i<50; i++) {// i++ <=> i = i+1
	    	  if(x%2==0){
	    		  System.out.print(x);
	    		  
	    	  }else {
	    		  System.out.print(-1*x);

	    	  }	
	    	  if(i==49 ) {
	    		  System.out.print(".");
	    	  }else {
	    		  System.out.print(",");
	    	  }
	    	  x+= 5;
	      }
	      System.out.println("\ntask8");
	      for(int i = 1;i<15; i++) {// i++ <=> i = i+1
		  
		  System.out.print(i*i + " ");		
		  
	      }	
	      System.out.println("\ntask9");
	      for(int i = 0;i<100; i++) {
	      int	f = (int)  (Math.random()*100 +  1);
	    	boolean isPositive = (int) (Math.random() *2) == 1;
           if(isPositive) { System.out.print(i+ " ");
 		  
 	  }else {
 		  System.out.print((-1)*i+ " ");

 	  }
           }
	      }
	
}

