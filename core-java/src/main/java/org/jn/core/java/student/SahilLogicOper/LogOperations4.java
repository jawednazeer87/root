package org.jn.core.java.student.SahilLogicOper;

public class LogOperations4 {
public static void main(String[] args) {
	boolean lampX = false ;
	boolean lampY = true;
	boolean result = lampY && lampY;
	System.out.println("Lamp switch-on " + result);
	result = lampY && lampX;
	System.out.println("Lamp switch-on " + result);
	
}
}
