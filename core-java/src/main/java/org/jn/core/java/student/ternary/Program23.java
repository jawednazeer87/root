package org.jn.core.java.student.ternary;

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7 * 3 + 6 / 2 - 5;//19
        int b = 21 - 8 + a % 3 * 11;//24
        //System.out.println(19%33);
        //System.out.println(b);
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
