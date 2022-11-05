package org.jn.core.java.student.shoaeeb.logicaloperation;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, d = 50, e = 50;
        boolean b = (c == 1) && (++e < 100);
        System.out.println("e = " + e);
        boolean f = (++e < 100) && (c == 1);
        System.out.println("e = " + e);
	}

}
