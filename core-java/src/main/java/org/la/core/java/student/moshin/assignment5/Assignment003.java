package org.la.core.java.student.moshin.assignment5;

public class Assignment003 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int j=10;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 10;
			System.out.println("arr["+i+"]= "+arr[i]);
		}	
		System.out.println("Length of the Array is: "+arr.length);
	
	}

}
