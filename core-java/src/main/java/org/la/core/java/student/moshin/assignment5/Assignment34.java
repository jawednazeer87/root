package org.la.core.java.student.moshin.assignment5;

public class Assignment34 {
	
	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6,0,17,0,16,14,12};
		int arrayLengthWithOutZero = 0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]!=0)
			arrayLengthWithOutZero++;
		}
			//System.out.println(arrayLengthWithOutZero);	
			int[] newArray = new int[arrayLengthWithOutZero];
			int j=0;
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i]!=0) {
					newArray[j] = arr1[i];
				j++;
				}
			}
			for(int i=0; i<newArray.length;i++) {				
					System.out.println(newArray[i]);
			}			
	}
}