package org.la.core.java.student.moshin.assignment5;

public class Assignment24 {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = {1,2,3,4,5,6,7,7,6,6,4,2,2};
		for(int i=0; i<arr1.length;i++) {
			for(int n=i+1; n<arr1.length;n++) {
				if(arr1[i] == arr1[n]) {
					arr1[n] = null;
				} 
			}
			
			System.out.println(arr1[i]);
			
		}
		
	}

}