package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 39)	wap to subtract -1 from each element of an array 
 */
public class Example39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {65,4,6,35,537,35,48};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]-1;
			System.out.println("a["+i+"] "+a[i]);
		}
	}

}
