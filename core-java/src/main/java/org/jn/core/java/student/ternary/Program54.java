package org.jn.core.java.student.ternary;

public class Program54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character = 'a';
		if(character>=65 && character<=92)
		{
			System.out.println("Capital");
		}
		else if(character>=97 && character<=122)
		{
			System.out.println("Small");
		}
		else {
			System.out.println("Not a letter");
		}
	}

}
