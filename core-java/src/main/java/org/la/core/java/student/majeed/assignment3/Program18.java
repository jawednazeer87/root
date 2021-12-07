package org.la.core.java.student.majeed.assignment3;

public class Program18 {

	public static void main(String[] args) {
		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        System.out.println(a);
        System.out.println(b);
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        if(a == b)
        {
            System.out.println("A is equal to B");
        }
        if(a > b)
        {
            System.out.println("A is greater than B");
        }
	}

}
