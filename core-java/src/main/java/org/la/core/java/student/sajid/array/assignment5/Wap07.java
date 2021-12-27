package org.la.core.java.student.sajid.array.assignment5;

public class Wap07 {

	public static void main(String[] args) {
		// wap to print only negative number from an array
		
				int a[] = new int [6];
				
				for (int j=0;j < a.length ;j++){
					a[j] = j-2;
					System.out.println("Values in the array a["+j+"]: "+a[j]);
				}
								
				for (int i=0;i < a.length ; i++) {
					
					
					if(a[i] < 0)			
						System.out.println("Positive numbers in array a["+i+"]: "+a[i]);
				}


	}

}
