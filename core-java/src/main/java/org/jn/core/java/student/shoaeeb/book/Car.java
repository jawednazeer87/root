package org.jn.core.java.student.shoaeeb.book;

public abstract class Car {
	int regno;
	Car(int r)
	{
		regno=r;
	}
	
	abstract void getRegno();
	abstract void steering(int direction,int angle);
	abstract void braking(int force);
}
