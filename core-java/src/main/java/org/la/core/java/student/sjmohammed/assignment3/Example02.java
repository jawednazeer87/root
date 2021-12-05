package org.la.core.java.student.sjmohammed.assignment3;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1050,b=50,c=80;
		int greatest= a > b ? a>c ?a:c : b>c?b:c;
	//               (cond) ? (cond1 ?t1 :f1) :c2 ? t2 : f2
		System.out.println("Greatest " +greatest);
	}

}
