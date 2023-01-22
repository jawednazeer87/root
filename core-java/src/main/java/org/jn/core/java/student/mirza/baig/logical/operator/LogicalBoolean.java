package org.jn.core.java.student.mirza.baig.logical.operator;

public class LogicalBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);

	}

}
