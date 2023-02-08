package org.jn.core.java.student.shoaeeb.methods;

public class Program1 {
	private int num;
	private int num2;
	
	Program1(int a,int b)
	{
		num=a;
		num2=b;
	}
	
	void sum() {
		System.out.println("sum is: "+(num+num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p  = new Program1(20,25);
		p.sum();
	}

}
