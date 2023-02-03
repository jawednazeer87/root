package org.jn.corejava.student.aameen.clss.one;

public class NoDefaultConstructProb {

	private int id ;
	private String name;
	
	public NoDefaultConstructProb(int  i , String nm)
	{
		id = i;
		name=nm;
	}
	public void print()
	{
		System.out.println("id :"+id+" , name : "+name);
	}
	
}
