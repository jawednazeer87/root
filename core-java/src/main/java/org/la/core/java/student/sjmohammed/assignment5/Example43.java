package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 
	43)	wap to multiply 3 to each element of an array
		Suppose given array is [10, 19, 2, 7] -> answer 30, 57, 6, 21
 */
public class Example43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 19, 2, 7};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*3;
			System.out.println("a["+i+"] "+a[i]);
		}
	}

}
