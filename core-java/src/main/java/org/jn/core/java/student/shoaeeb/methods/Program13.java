package org.jn.core.java.student.shoaeeb.methods;

import java.text.NumberFormat;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI =(double)22/7;
		double radius=15.5;
		double area = radius*radius*PI;
		System.out.println("Area: "+area);
		NumberFormat obj = NumberFormat.getNumberInstance();
		obj.setMaximumIntegerDigits(3);
		obj.setMaximumFractionDigits(7);
		String str = obj.format(area);
		System.out.println("Area: "+str);
		
	}

}
