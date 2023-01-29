package org.jn.core.java.student.shoaeeb.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class A {
	void method(){
		
	
	try {
 		String str="Hello";
		char ch= str.charAt(5);
	}
	catch(StringIndexOutOfBoundsException ae)
	{
		throw ae;
	}
}
}
