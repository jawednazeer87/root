package org.jn.core.java.jawed.model;

public class RobotMain {

	public static void main(String[] args) {
		RobotChild rc = new RobotChild();
		rc.defaultVariable = 3;
		rc.protectedVariable = 2;
		rc.defaultMethod();
		rc.protectedMethod();
		rc.publicMethod();
	}
}