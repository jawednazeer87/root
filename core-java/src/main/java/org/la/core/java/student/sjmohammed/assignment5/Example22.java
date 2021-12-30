package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to calculate the factorial of each element of an array?
 */
public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < a.length; i++) {
            int n = a[i], f = 1;
            while (n >= 1) {
                f = f * n;
                n--;
            }
            System.out.println(a[i] + "'s factorial is " + f);
        }
	}

}
