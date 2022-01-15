package org.la.core.java.student.sajid.array.assignment5;

public class Wap14 {

	public static void main(String[] args) {
		// wap to find greatest number from any array
		
		int a[] = new int[6];
		
		for(int i=0;i<=a.length-1;i++) {
			a[i] = i+1;
		}
		
		int g = a[0];
		for(int i=1 ; i<a.length ; i++) {
			if(g<a[i]) {
				g = a[i];
				System.out.println("Value of g: "+g);
			}
		}
		System.out.println("Greatest: "+g);

	}

}
