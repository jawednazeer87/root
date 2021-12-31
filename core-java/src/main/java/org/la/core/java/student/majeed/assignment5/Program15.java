package org.la.core.java.student.majeed.assignment5;

public class Program15 {

	public static void main(String[] args) {
		//15) wap to find smallest number among array element
		
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
