package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class StringReverseMain 
{
	public static void main(String[] args) 
	{
		StringReverse st = new StringReverseChild();
		String s = st.reverse("tolp");
		System.out.println(s);
		
		// Using static StringReverse method with string buffer class
		System.out.println(StringReverse.rev("yrettol"));
	}
}
