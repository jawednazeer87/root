package org.la.core.java.student.sjmohammed.assignment5;

/*WAP to print only positive number from an array*/
public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,-8,-9,3,-1,4,7};
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				System.out.println("a["+i+"] is odd "+a[i]);
			}
		}
	}

}
