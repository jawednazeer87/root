package org.jn.core.java.student.azhan.operators.logical;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY || result;
        System.out.println("Lamp switch-on " + result);
	}

}