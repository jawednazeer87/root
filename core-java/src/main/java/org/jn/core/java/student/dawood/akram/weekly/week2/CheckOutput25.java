package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY & lampX;
        System.out.println("Lamp switch-on " + result);
	}

}
