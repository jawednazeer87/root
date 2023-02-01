package org.jn.core.java.student.shoaeeb.lambda;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ref =(r) -> System.out.println(Math.PI *r *r);
		ref.calculate(3.9);
	}

}
