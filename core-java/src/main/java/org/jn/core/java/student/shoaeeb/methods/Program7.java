package org.jn.core.java.student.shoaeeb.methods;

public class Program7 {
	private int x=1;
	
	void printValue() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 p =new Program7();
		Program7 q = new Program7();
		p.printValue();
		q.printValue();
		++p.x;
		p.printValue();
		q.printValue();
		
	
		
	}

}
