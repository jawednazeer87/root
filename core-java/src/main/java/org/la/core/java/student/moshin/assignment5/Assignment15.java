package org.la.core.java.student.moshin.assignment5;

public class Assignment15 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		int j=1, smallestNum=10;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			
			if (arr[i] < smallestNum) 
				smallestNum = arr[i];
			
		}			
		System.out.println(smallestNum);
	
	}

}
