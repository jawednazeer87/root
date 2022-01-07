package org.la.core.java.student.arfaz.assignment_6;

/*
 * 
 * void copy(int[], int[])
		copy first array to second array
*/

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7,8,9};
		int b[] = new int[a.length];
		copyArray(a,b);
	}
	static void copyArray(int[]a,int n[]) {
		int f=0;
		for(int i=0;i<a.length;i++)  {
          n[i]= a[i];
						
		}
		for(int c:n)
			System.out.println(c);
  	}
}
