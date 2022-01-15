package org.la.core.java.student.majeed.assignment5;

public class Program3 {

	public static void main(String[] args) {
		//03) wap to find length of an array
		
		int[] arr = new int[7];
		int j=10;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 10;
			System.out.println("arr["+i+"]= "+arr[i]);
		}	
		System.out.println("Length of the Array is: "+arr.length);
	}

}
