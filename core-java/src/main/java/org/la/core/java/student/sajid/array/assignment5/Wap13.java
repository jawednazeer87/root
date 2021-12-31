package org.la.core.java.student.sajid.array.assignment5;

public class Wap13 {

	public static void main(String[] args) {
		// wap to find sum of an array element
		
		int a[] = new int[3];
		int sum = 0;
		
		for(int i=0;i<=a.length-1;i++) {
			a[i] = i+1;
		}
		
		for(int j=0;j<=a.length-1;j++) {
			sum = sum + a[j]; 
			System.out.println("a["+j+"]: "+a[j]);
		}
		System.out.println("sum of elements in the array a: "+sum);
	}

}
