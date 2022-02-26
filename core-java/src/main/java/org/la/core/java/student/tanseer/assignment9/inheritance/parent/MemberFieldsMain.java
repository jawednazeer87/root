package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class MemberFieldsMain 
{
	public static void main(String[] args) 
	{
		MemberFieldsAccesSpecifier mb = new MemberFieldsAccesSpecifier();
		mb.email = "official@gmail.com";
		mb.name = "Fouzaan";
		mb.weight = 78.5666;
		mb.setId(12);
		
		System.out.println(mb.email);
		System.out.println(mb.name);
		System.out.println(mb.weight);
		System.out.println(mb.getId());
	}
}
