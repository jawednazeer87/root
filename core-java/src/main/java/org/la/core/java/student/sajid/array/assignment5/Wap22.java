package org.la.core.java.student.sajid.array.assignment5;

public class Wap22 {

	public static void main(String[] args) {
		// wap to calculate the factorial of each element of an array?
		

			int a[] = {4,3,5};
	
			System.out.println("Factorial of each element in the given array are: ");
			for(int i=0;i<a.length;i++) {
				int sum = 1;
		
				for(int j=1;j<=a[i];j++) {			
					sum = sum * j;
				}
				System.out.print(" "+sum);

			}
	
	}
}
