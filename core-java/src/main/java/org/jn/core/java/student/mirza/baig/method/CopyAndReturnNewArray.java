package org.jn.core.java.student.mirza.baig.method;

public class CopyAndReturnNewArray {

	
	static int[]copy(int []a ) {
		

		int [] b = new int[a.length];
		
		
		
		for (int i=0; i<a.length; i++) {
			b[i]=a[i];
			a[0]=100;
			 
			System.out.print(a[i]+" ");
		}
	
		System.out.println();
		
	for (int i=0; i<b.length; i++) 
			System.out.print(b[i]+" ");
			
			
	
return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,3,4,5};

		copy(a);
	}

}


//int[] copy(int[])
//create an array and copy supplied array and return that new array