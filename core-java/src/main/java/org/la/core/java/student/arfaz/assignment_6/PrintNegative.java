package org.la.core.java.student.arfaz.assignment_6;

//void printNegative(int[])
//method will print all negative number from supplied array

public class PrintNegative {

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7};
		printNegative(a);
	}
	static void printNegative(int[]a) {
		for(int i=0;i<a.length;i++)  {
			if(a[i]<0)
				System.out.println(a[i]);
		}

	}
}
