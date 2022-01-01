package org.la.core.java.student.majeed.assignment5;

public class Program26 {

	public static void main(String[] args) {
		//26) wap to test if an array contains a specific value?
		
		int[] arr1 = {1,2,3,4,5,6,7};
		int specificValue = 4;
		boolean yes = false;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] == specificValue) {
				yes = true;
				break;
			}
		}	
			System.out.println(yes);
	}
}
