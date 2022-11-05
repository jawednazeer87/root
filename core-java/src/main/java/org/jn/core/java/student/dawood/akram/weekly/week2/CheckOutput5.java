package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;
		System.out.println(a);//10
		System.out.println(b);//4
		System.out.println(x);//true
		System.out.println(y);//true
	}

}
