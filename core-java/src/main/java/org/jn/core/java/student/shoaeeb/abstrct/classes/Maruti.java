package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class Maruti extends Car{

	Maruti(int regNo) {
		super(regNo);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ref;
		Maruti m =new Maruti(66);
		ref=m;
		ref.openTank();
		ref.steering(0, 0);
		ref.braking(0);
	}

	@Override
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Normal Steering");
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("Gas braking");
	}

}
