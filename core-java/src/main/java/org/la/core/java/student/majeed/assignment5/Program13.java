package org.la.core.java.student.majeed.assignment5;

public class Program13 {

	public static void main(String[] args) {
		//13) wap to find sum of an array element
		
		int[] arr = new int[20];
		int j=1, sum=0;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			sum += arr[i];
		}			
		System.out.println(sum);
	}

}
