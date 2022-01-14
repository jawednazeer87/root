package org.la.core.java.student.moshin.assignment5;

public class Assignment22 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7};
		for(int i=0; i<arr1.length;i++) {
			int k = arr1[i];
			int j =1;
			for(;k>=1;k--) {
				j= j*k;
			}
			System.out.println("Factorial of "+arr1[i]+" is: "+j);
		}	}

}
