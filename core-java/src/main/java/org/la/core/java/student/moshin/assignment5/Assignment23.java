package org.la.core.java.student.moshin.assignment5;

public class Assignment23 {
	
	public static void main(String[] args) {
		
int[] arr1 = {1,2,3,4,5,6,7,7,6,6,4,2,2};
		
		for(int i=0; i<arr1.length;i++) {
			int count = 0;
			int k = arr1[i];
			
			for(int n=0; n<arr1.length;n++) {
				if(k == arr1[n]) {
					count += 1 ;
				}
			}
			
			System.out.println("Count of "+arr1[i]+" is: "+count);
		}
		
	}

}
