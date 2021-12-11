package org.la.core.java.jawed.loop;

public class ScopeOfVariableDeclaration {

	public static void main(String[] args) {
		
		{
			int i = 10;
			System.out.println("i: "+i);
		}
		int i = 120;
		System.out.println("i: "+i);
		
	}
}
