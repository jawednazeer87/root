package org.la.core.java.student.sajid.array.assignment5;

public class Wap08 {

	public static void main(String[] args) {
		// wap to print number divisible by given number from an array
		
		
		int givenNum = 2;
		
		int a[] = new int [6];
		
		for (int j=0;j < a.length ;j++){
			a[j] = j+1;
			System.out.println("Values in the array a["+j+"]: "+a[j]);
		}
						
		for (int i=0;i < a.length ; i++) {
			
			
			if(a[i] % givenNum ==  0)			
				System.out.println("numbers in array divisible by "+givenNum+" are a["+i+"]: "+a[i]);
		}


	}

}
