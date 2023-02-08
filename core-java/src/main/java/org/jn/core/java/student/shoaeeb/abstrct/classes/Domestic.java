package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class Domestic extends Plan{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domestic d = new Domestic();
		d.getRate();
		d.calculate(100);
	}

	void getRate() {
		rate=2.50;
	}
	@Override
	void calculate(int units) {
		// TODO Auto-generated method stub
		System.out.println("  "+units*rate);
	}

}
