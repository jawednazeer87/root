package org.jn.core.java.student.shoaeeb.practice;

public class One {
	int x;
	Two obj;
	
	One(Two obj)
	{
		this.obj=obj;
	}
	
	double cube(int x) {
		return x * obj.square(x);
	}
}
