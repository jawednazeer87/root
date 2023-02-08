package org.jn.core.java.student.shoaeeb.objects;

public class Cube {
	int x;
	Square y;
	
	Cube(int x ,Square y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getCube() {
		return x* y.getSquare();
	}
	

}
