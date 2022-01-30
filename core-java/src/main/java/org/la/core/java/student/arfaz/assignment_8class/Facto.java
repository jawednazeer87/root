package org.la.core.java.student.arfaz.assignment_8class;

public class Facto {
	private long a;
	
	public void seta(int fir) {
		a=fir;
	}
	public long geta() {
		return a;
	}
	
	
	
	public int fact() {
		int fac=1;
		for(int i=1;i<=a;i++)
			fac = fac*i;
		return fac;
	}
}
