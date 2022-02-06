package org.la.core.java.student.arfaz.assignment_9this;

public class Percent {
	private double a;
	private double b;
	private double i;
	private double j;
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
	public void setj(double j) {
		this.j=j;
	}
	public double getj() {
		return j;
	}
	
	
	public double per() {
		double n = (a+b+i+j)/400; 
		return n*100;
	}
}
