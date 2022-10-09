package org.jn.core.java.jawed.operators.ternary;

public class GreatestAmongThree {

	public static void main(String[] args) {
		int a=-40, b=5, c=-13;
		int greatest = a>b ? a>c?a:c : b>c?b:c ;
		System.out.println("Greatest: "+greatest);
	}
}