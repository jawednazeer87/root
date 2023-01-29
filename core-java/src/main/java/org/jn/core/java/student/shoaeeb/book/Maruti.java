package org.jn.core.java.student.shoaeeb.book;

public class Maruti extends Car{

	Maruti(int regno)
	{
		super(regno);
	}

	@Override
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Take a turn");
		System.out.println("This is ordinary Steering");
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("This is normal braking");
	}

	@Override
	void getRegno() {
		// TODO Auto-generated method stub
		System.out.println(regno);
	}

	

}
