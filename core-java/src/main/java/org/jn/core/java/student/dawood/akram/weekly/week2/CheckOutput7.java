package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		int b = 1;
		boolean x = ++a<=0 && ++b>1;
		boolean y = --a > -2 || b-- < 1;
		System.out.println(a);//-1
		System.out.println(b);//2
		System.out.println(x);//true
		System.out.println(y);//true
	}

}
