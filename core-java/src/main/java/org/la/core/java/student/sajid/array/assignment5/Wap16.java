package org.la.core.java.student.sajid.array.assignment5;

public class Wap16 {

	public static void main(String[] args) {
		// wap to reverse an array
		
		int a[] =  {4,2,11,13};
		int b[] = new int [4];

		//print values from the array
		for(int i=0;i<a.length;i++) {
		System.out.println("a["+i+"]: "+a[i]);
		}	
		
		//Reverse the array;
		
		for(int i=a.length-1,j=0; i>=0; i--,j++) {
									
			
			b[j]=a[i];
					
		}
		
		//print values from the array after reversing
		for(int i=0;i<a.length;i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}	
		
	}

}
