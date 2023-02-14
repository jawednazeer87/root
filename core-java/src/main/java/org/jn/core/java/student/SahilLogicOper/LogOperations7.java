package org.jn.core.java.student.SahilLogicOper;

public class LogOperations7 {
public static void main(String[] args) {
	int c = 0, e = 50;
	boolean b = (c == 1) || (++e < 100);
	System.out.println("b = " + b);
	boolean f = (e++ < 100) || (c == 1);
	System.out.println("f = " + f);
}
}
