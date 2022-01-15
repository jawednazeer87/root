package org.la.core.java.student.sajid.array.assignment5;

public class Wap21 {

	public static void main(String[] args) {
		// wap to print all prime numbers from an array
		
		int a[] = {18,3,7,11,13,17,16};
		
		System.out.println("Prime numbers in the given array are: ");
		for(int i=0;i<a.length;i++) {
			int count = 0;
			
			for(int j=1;j<=a[i];j++) {			
				if(a[i]%j==0) {
					count++;					
				}
			}
			if (count == 2) {
				System.out.print(" "+a[i]);
				
			}
		}

	}

}
