package org.la.core.java.student.meenah.abstra;

public class Moon extends Planet{

	
	@Override
	public void name() {
		System.out.println("This is moon");
	}
	
	@Override
	public int distance( int x) {
		return x;
	}
}


