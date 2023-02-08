package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class Santro extends Car{

	Santro(int regNo) {
		super(regNo);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ref;
		Santro s = new Santro(1192);
		ref=s;
		ref.openTank();
		ref.steering(0, 0);
		ref.braking(0);
	}

	@Override
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Power Steering");
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("Power Braking");
	}
	
	

}
