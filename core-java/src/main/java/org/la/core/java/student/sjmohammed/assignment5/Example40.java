package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 40)	wap to add 5 to each element of an array
 */
public class Example40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {65,4,6,35,537,35,48};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+5;
			System.out.println("a["+i+"] "+a[i]);
		}
	}

}
