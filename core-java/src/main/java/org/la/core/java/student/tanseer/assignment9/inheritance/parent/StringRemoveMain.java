package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class StringRemoveMain 
{
	public static void main(String[] args) 
	{
		StringRemove st = new StringRemoveChild();
		System.out.println(st.remove("Stringe", 'd').replace('e', 's'));
		
//		String s = "parameters";
//		String s1 = s.replace('s', 'e');
//		System.out.println(s1);
		
	}
}
