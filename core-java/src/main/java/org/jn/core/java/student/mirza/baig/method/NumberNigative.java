package org.jn.core.java.student.mirza.baig.method;


public class NumberNigative {
	  
   public static void printNigative(int [] a) {
		
		for( int val: a) {
			
		if (val<0) 
			System.out.print(val+ " ");
			}
	
		}
   
		public static void main(String[] args) {
			
			 int [] a= {10,20,-30,40,-50,60,-70,80,-90};  
	   
      printNigative(a);
  
	
	}
	

}
