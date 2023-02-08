package org.jn.core.java.student.shoaeeb.polymorphism;

public class Two extends One{
	Two(int i)
	{
		super(i);
	}
	@Override
	void calculate()
	{
		System.out.println("Square root: "+Math.sqrt(i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t = new Two(4);
		t.calculate();
		One o  = new Two(4);
		o.calculate();
	}

}
