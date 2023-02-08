package org.jn.core.java.student.shoaeeb.methods;

public class Program8 {

	static int x=1;
	
	void printValue() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 p = new Program8();
		p.printValue();
		Program8 q = new Program8();
		q.printValue();
		
		++p.x;
		
		q.printValue();

	}

}
