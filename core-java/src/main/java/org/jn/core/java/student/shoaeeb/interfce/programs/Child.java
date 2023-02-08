package org.jn.core.java.student.shoaeeb.interfce.programs;

public class Child implements Father,Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.height();
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		float ht=(Father.ht+Mother.ht)/2;
		System.out.println("Childs Height is: "+ht);
	}

	

}
