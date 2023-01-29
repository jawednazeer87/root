package org.jn.core.java.student.shoaeeb.book;

public class Santro extends Car{

	Santro(int regno)
	{
		super(regno);
	}

	@Override
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Take a turn");
		System.out.println("This is power steering");
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("This is gas brakes");
	}

	@Override
	void getRegno() {
		// TODO Auto-generated method stub
		System.out.println(regno);
	}

}
