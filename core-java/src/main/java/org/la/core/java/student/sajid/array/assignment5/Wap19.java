package org.la.core.java.student.sajid.array.assignment5;

public class Wap19 {

	public static void main(String[] args) {
		// wap to find duplicate elements in an array
		
		int a[] = {2,3,2,4,3,6};
		
		System.out.print("Duplicate element in given array:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
					if(a[j]==a[i]) {
				System.out.print(" "+a[i]);
			}
		}
		
		}
	}

}
