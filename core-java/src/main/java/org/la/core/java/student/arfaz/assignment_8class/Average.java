package org.la.core.java.student.arfaz.assignment_8class;

public class Average {
	private double a;
	private double b;
	private double i;
	public void seta(double fir) {
		a=fir;
	}
	public double geta() {
		return a;
	}
	public void setb(double c) {
		b=c;
	}
	public double getb() {
		return b;
	}
	public void seti(double fir) {
		i=fir;
	}
	public double geti() {
		return i;
	}
	
	public double avg() {
		return (a+b+i)/3;
	}
}
