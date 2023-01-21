package org.jn.core.java.student.shoaeeb.practice;

public class Two {
	int x;
	Three obj;
	
	Two(Three obj)
	{
		this.obj=obj;
	}
	
	double square(int x)
	{
		return x*obj.get(x);
	}
}
