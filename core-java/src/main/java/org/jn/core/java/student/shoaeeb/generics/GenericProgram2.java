package org.jn.core.java.student.shoaeeb.generics;

public class GenericProgram2<T> {
//generic classs
	T x;
	GenericProgram2(T x)
	{
		this.x=x;
	}
	
	T getObj() {
		return x;
	}
	
	public static void main(String args[])
	{
		String s =" Hello World!";
		GenericProgram2<String> obj =  new GenericProgram2<>(s);
		System.out.println(obj.getObj());
		char x='a';
		GenericProgram2<Character> obj2 = new GenericProgram2<>(x);
		System.out.println(obj2.getObj());
	}
	
}
