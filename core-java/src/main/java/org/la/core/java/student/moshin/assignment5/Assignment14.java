package org.la.core.java.student.moshin.assignment5;

public class Assignment14 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		int j=1, greatestNum=0;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			
			if (arr[i] > greatestNum) 
				greatestNum = arr[i];
			
		}			
		System.out.println(greatestNum);
	
	}

}
