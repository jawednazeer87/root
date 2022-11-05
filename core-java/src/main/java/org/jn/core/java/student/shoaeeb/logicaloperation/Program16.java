package org.jn.core.java.student.shoaeeb.logicaloperation;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 27 / 4 + 9;//12
        int b = 52 / 6 - 3;//1
        int c = 3;
        c = a++ - b;
        a = a * b; 
        b = b + a; 
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a + " b = " + b + " c = " + c);

	}

}
