package org.jn.core.java.jawed.loop;

public class ScopeOfVariable {

	public static void main(String[] args) {
		
		{
			int i = 10;
			System.out.println("i: "+i);
			{
				System.out.println("i: "+i);
			}
		}
		
	}
}