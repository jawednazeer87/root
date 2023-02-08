package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class MyClass {
	private int i;
	MyClass(int i)
	{
		this.i=i;
	}
	void calculate()
	{
		System.out.println("Square is: "+(i*i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m = new MyClass(5);
		m.calculate();
		MyClass n= new MyClass(6);
		n.calculate();
		MyClass o = new MyClass(4);
		o.calculate();


	}

}
