package org.jn.core.java.student.azhan.operators.logical;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
        int y = 10;
        double z = x++ - y * 7 / --y + x * 10;
        System.out.println(z);
	}

}