package org.la.core.java.student.majeed.assignment5;

public class Program33 {

	public static void main(String[] args) {
		//33) wap to find the second smallest element in an array?
		
		int[] arr1 = {1,2,3,4,5,6,7,17,16,14,12};
		int temp;
		for(int i=0; i<arr1.length;i++) {
			for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i]>arr1[j]){
                 temp = arr1[i];
                 arr1[i]= arr1[j];
                 arr1[j]=temp;
                }
            }
			}
		System.out.println("Second Largest Number is: "+arr1[1]);
	}
}