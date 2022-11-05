package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment2;

public class CompProblemTwentySeven {
	public static void main(String args[]) {
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on " + result);
        result = result && lampX;
        System.out.println("Lamp switch-on " + result);
	}
}
