package org.jn.core.java.student.shoaeeb.abstrct.classes;

public abstract class Car {
	private int regNo;
	
	Car(int regNo)
	{
		this.regNo=regNo;
	}
	
	void openTank() {
		System.out.println("Fill the tank");
	}
	
	abstract void steering(int direction,int angle);
	abstract void braking(int force);
}
