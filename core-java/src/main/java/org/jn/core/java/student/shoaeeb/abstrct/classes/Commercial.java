package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class Commercial extends Plan{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commercial c = new Commercial();
		c.getRate();
		c.calculate(100);
		
	}
	void getRate() {
		rate=5.00;
	}
	@Override
	void calculate(int units) {
		// TODO Auto-generated method stub
		System.out.println(" "+rate*units);
	}

}
