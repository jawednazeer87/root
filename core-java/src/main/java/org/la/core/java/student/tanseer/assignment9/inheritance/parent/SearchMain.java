package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class SearchMain 
{
	public static void main(String[] args) 
	{
		Search sc = new SearchChild();
		
		int v = sc.search("Ahmed", 's');
		System.out.println(" It is found and the position is :"+ v);
		
		int m =sc.search("Wahid", 'h');
		System.out.println(" It  is found and the position is :"+ m);
		
		int c = sc.search("Aiman", 'q');
		System.out.println(" It is not  found and the position is not there :"+ c);
	}
}
