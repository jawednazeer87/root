package org.jn.core.java.student.mirza.baig.method;

public class CopyArray {

	
	static void copyArray(int [] a, int [] b){
		
		
		for (int i=0; i<a.length; i++) {
			b[i]=a[i];
			//a[5]=100;
		System.out.print(a[i]+ " ");	
		}
		System.out.println();
		
			for (int i=0; i<b.length; i++ ) {
				
				System.out.print(b[i]+ " ");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int []a = {1,2,3,4,5,6,7,8,9};
			
			int []b = new int [a.length];
			copyArray(a,b);
			
		
		
	}

}


// void copy(int[], int[])
//copy first array to second array