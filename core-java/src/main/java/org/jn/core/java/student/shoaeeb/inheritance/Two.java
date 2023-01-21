package org.jn.core.java.student.shoaeeb.inheritance;

public class Two extends One{
	int a;
	Two(int a) {
		super(a);
		this.a=a;
	}
	
	void show() {
		System.out.println(" "+super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two two = new Two(5);
		two.show();
	}

}
