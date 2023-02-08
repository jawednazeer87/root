package org.jn.core.java.student.shoaeeeb.inheritance;

//child class 
public class Program5 extends Program3 {
	int i;
	void show() {
		System.out.println("Sub class i: "+i);
		super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 p  = new Program5();
		p.show();
	}

}
