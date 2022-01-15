package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to check if an array of integers without 0 and -1?
 */
public class Example35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,0,5,24,23};
		for(int i=0;i<a.length;i++) {
			if(a[i]==0 ||a[i]==-1) {
				System.out.println("Array contain 0 or -1");			
			}
			System.out.println("Array not contain 0 or -1");
		}

	}

}
