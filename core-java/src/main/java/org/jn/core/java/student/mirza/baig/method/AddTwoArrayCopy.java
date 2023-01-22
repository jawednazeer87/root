package org.jn.core.java.student.mirza.baig.method;

public class AddTwoArrayCopy {

	static int[] addTwoArray(int []a, int [] b) {
		
		int [] c = new int[a.length];
		

		for (int i=0; i<a.length; i++) {
		
		
		
		
		System.out.print(a[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<c.length; i++) {
			
			
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for (int i =0; i<b.length; i++) {
			
	c[i]=b[i];
	
	
		System.out.print(b[i]+ " ");
		}
		System.out.println();

		for (int i=0; i<c.length; i++) {
			
			System.out.print(c[i]+ " ");
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9,10};
		
		
		addTwoArray(a,b);
		
		

	}

}





//int[] addTwoArrays(int[], int[]) - all array of same size
//add two supplied arrays elements and then copy the some of each element to 3rd array and 
//return 3rd array.