package org.la.core.java.student.majeed.assignment5;

public class Program2 {

	public static void main(String[] args) {
		//02) wap to create and print array using loop
		
		int[] arr = new int[5];
		int j=10;
		for(int i=0; i<=4;i++) {
			arr[i] = j;
			j += 10;
			System.out.println("arr["+i+"]= "+arr[i]);
		}		
	}

}
