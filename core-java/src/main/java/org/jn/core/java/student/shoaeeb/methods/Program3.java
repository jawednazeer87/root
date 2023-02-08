package org.jn.core.java.student.shoaeeb.methods;

public class Program3 {
	private double num;
	private double num2;
	
	Program3(double num,double num2)
	{
		this.num=num;
		this.num2=num2;
	}
	
	double sum() {
		return num+num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 p = new Program3(2.2d,3.4d);
		System.out.println(p.sum());
	}

}
