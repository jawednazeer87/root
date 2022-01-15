package org.la.core.java.student.mdfarman.array.assignment5;


public class Question22 {
	//	22) wap to calculate the factorial of each element of an array?



	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};		

		for (int i = 0 ; i < arr.length; i++) {
			int num = arr[i];
			int fact=1;  
			for(int j=1; j<=num;j++){    
			      fact=fact*j;    
			  }    
			  System.out.println("Factorial of "+num+" is: "+fact);   

			
		}

	}
}
