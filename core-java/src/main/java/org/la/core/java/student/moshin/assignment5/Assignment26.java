package org.la.core.java.student.moshin.assignment5;

public class Assignment26 {
	
	public static void main(String[] args) {
		
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
