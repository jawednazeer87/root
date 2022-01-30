package org.la.core.java.student.arfaz.assignment_8class;

public class Percent {
	private double a;
	private double b;
	private double i;
	private double j;
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
	public void setj(double fir) {
		j=fir;
	}
	public double getj() {
		return j;
	}
	
	
	public double per() {
		double n = (a+b+i+j)/400; 
		return n*100;
	}
}
