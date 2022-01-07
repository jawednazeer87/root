package org.la.core.java.student.arfaz.assignment_6;

/*
 * 
 * void printPositive(int[])
	method will print all positive number from supplied array


*/

public class PrintPositive {

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7,8,9};
		printPositive(a);
	}
	static void printPositive(int[]a) {
		for(int i=0;i<a.length;i++)  {
			if(a[i]>0)
				System.out.println(a[i]);
		}

	}
}
