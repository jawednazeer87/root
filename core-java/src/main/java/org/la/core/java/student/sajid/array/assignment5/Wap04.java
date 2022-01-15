package org.la.core.java.student.sajid.array.assignment5;

public class Wap04 {

	public static void main(String[] args) {
		// wap to print only odd numbers from an array
		
		int a[] = new int [5];
		
		for (int j=0;j < a.length ;j++){
			a[j] = j+1;
		}
		
		for (int i=0;i < a.length ; i++) {
			if(a[i]%2 !=0)			
				System.out.println("a["+i+"]: "+a[i]);			
		}
	}

}
