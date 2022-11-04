package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CheckOutput24 {

	public static void main(String[] args) {
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY & lampX;
        System.out.println("Lamp switch-on " + result);
	}
}
