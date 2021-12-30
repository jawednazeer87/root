package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to insert an element (specific position) into an array?
 */
public class Example29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 3, 1, 7};
        int[] b = new int[a.length+1];
        for (int i = 0,j=0; i < a.length; i++,j++) {
                b[j]=a[i];
        }
        b[5]=9;
        for(int i=0;i<b.length;i++) {
        	System.out.println("b["+i+"] "+b[i]);
        }
	}

}
