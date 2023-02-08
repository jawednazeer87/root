package org.jn.core.java.student.shoaeeb.objects;

public class Square {
	int x;
	Num n;
	
	Square(int x,Num n)
	{
		this.x=x;
		this.n= n;
	}
	
	int  getSquare() {
		return x*n.getNum();
	}
	
	
}
