package org.la.core.java.student.arfaz.assignment_6;

/*
 * 
 * void printEven(int[])
		method will print all even number from supplied array

*/

public class PrintEven {

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7,8,9};
		printEven(a);
	}
	static void printEven(int[]a) {
		for(int i=0;i<a.length;i++)  {
			if(a[i]%2==0)
				System.out.println(a[i]);
		}

	}
}
