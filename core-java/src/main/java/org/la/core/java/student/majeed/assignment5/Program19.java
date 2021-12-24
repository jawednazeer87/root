package org.la.core.java.student.majeed.assignment5;

public class Program19 {

	public static void main(String[] args) {
		//19) wap to find duplicate elements in an array? 
		
		int[] arr1 = {1,2,3,3,4,5,6,5};
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1; j<arr1.length;j++) {
			if (arr1[i] == arr1[j])
			System.out.println(arr1[j]);
			}	
		}
	}
}
