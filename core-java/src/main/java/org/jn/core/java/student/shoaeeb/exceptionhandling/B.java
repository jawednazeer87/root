package org.jn.core.java.student.shoaeeb.exceptionhandling;

import java.io.IOException;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A a = new A();
			a.method();
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}

}
