package org.jn.core.java.student.azhan.array;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40};
		int sum=0;
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		System.out.println("Average = "+sum/arr.length);
			
	}

}
