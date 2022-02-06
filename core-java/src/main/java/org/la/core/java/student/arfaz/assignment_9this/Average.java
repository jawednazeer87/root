package org.la.core.java.student.arfaz.assignment_9this;

public class Average {
	private double a;
	private double b;
	private double i;
	public void seta(double a) {
		this.a=a;
	}
	public double geta() {
		return a;
	}
	public void setb(double b) {
		this.b=b;
	}
	public double getb() {
		return b;
	}
	public void seti(double i) {
		this.i=i;
	}
	public double geti() {
		return i;
	}
	
	public double avg() {
		return (a+b+i)/3;
	}
}
