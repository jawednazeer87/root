package org.la.core.java.student.sajid.array.assignment5;

public class Wap12 {

	public static void main(String[] args) {
		// wap to copy an array to another array in reverse order
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		//assign values to the array
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		//print values from the array
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}		
	
		int j = 0;
		for(int i=a.length-1;i>=0;i--) {
//			for(int j=0;j<=b.length;j++) {
//			if(a.length <= 0 ) {
				b[j++]=a[i];	
//			}
				
//			}			
		}
		
		//print values from the array
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}	

	}

}
