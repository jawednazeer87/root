package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 44)	wap to to divide each element of an array by 2.
		Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2
		then answer should be 10/2, 19/2, 2, 7/2 = 5, 9, 3, 1
 */
public class Example44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 19, 2, 7};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]/2;
			System.out.println("a["+i+"] "+a[i]);
		}
	}

}
