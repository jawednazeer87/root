package org.la.core.java.student.meenah.inherAssigment;

public class ClassOne extends School{

	@Override
	public void name(String s) {
		System.out.println("First Student name: " +s);
	}
	
	@Override
	public void numStudent(int n) {
	System.out.println("First stdunt number: " +n);
	}
	@Override
	public void adderss(String address) {
		System.out.println("First studen address: " +address);
		System.out.println();
	}
}

