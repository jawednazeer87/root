package org.jn.core.java.student.shoaeeb.lambda;

public class MultiplyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyInterface mi  = (a,b) -> {
			return a*b;
		};
		System.out.println(mi.mul(10, 20));
	}

}
