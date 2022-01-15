package org.la.core.java.student.sajid.array.assignment5;

public class Wap15 {

	public static void main(String[] args) {
		// wap to find smallest number among array element
		
		int a[] = new int[6];
		
		for(int i=0;i<=a.length-1;i++) {
			a[i] = i-1;
		}
		
		//print values from the array
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}	
		
		int g = a[0];
		for(int i=1 ; i<a.length ; i++) {
			if(g>a[i]) {
				g = a[i];
				System.out.println("Value of g: "+g);
			}
		}
		System.out.println("Smallest: "+g);

	}

}
