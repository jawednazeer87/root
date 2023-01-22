package org.jn.core.java.jawed.immutable;

import java.math.BigDecimal;

import org.jn.core.java.jawed.model.Mango;

public class ImmutableStudentMain {

	public static void main(String[] args) {
		Mango mango = new Mango("green", "sweet", 2);
		BigDecimal bd = new BigDecimal("45435.234234");
		final ImmutableStudent immutableStudent = 
				new ImmutableStudent(1, "jain", "Eight", mango, bd);
		System.out.println("no modification: " + immutableStudent);
		Mango mango2 = immutableStudent.getMango();
		mango2.setColor("red");
		BigDecimal bd2 = immutableStudent.getDB();
		bd2.subtract(new BigDecimal("3424.5453"));
		System.out.println("with modification: " + immutableStudent);
	}
}
