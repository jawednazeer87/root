package org.la.core.java.student.sajid.array.assignment5;

public class Wap10 {

	public static void main(String[] args) {
		// wap to print array in reverse order
		
		int [] a = new int [3];
		
		System.out.println("Length is: "+a.length);
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.println("value in a["+j+"] "+a[j]);
			
		}

	}

}
