package org.jn.core.java.student.shoaeeb.practice;

import java.text.NumberFormat;

public class AreaOfCircle {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		final double  PI = 3.14;
		double r = 15.5;
		double area = PI*r*r;
		System.out.println("Area: "+area);
		
		//factory method
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMaximumIntegerDigits(7);
		
		String str = nf.format(area);
		System.out.println(str);
		
		
		
	}

}
