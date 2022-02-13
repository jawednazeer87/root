package org.la.core.java.student.wang.assignment2;

public class PostPreIncrementDecrement20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 20. int x = 10; int y = -2; int z = ++x / y++; sop(x); sop(y); sop(z);
		 */
		int x = 10;
		int y = -2;
		int z = ++x / y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
