package org.la.core.java.student.meenah.abstra;

public class Sun extends Planet{

	
	@Override 
	public void name() {
		System.out.println("This is sun");
	}
	
	@Override
	public int distance (int x) {
		return x;
	}
}
