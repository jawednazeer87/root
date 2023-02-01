package org.jn.core.java.student.shoaeeb.lambda;

import java.util.function.Predicate;

public class PredicateProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> gt =(n)-> n>10;
		System.out.println(gt.test(1));
		
	}

}
