/**
 * 
 */
package org.la.core.java.jawed.clss;

import org.la.core.java.jawed.model.Robot;
import org.la.core.java.jawed.model.RobotChild;

/**
 * @author jawednazeer
 *
 */
public class RobotMainDiffPack {

public static void main(String[] args) {
		
		RobotChild rc = new RobotChild();
		//rc.defaultVariable = 3;
		//rc.protectedVariable = 2;
		//rc.defaultMethod();
		//rc.protectedMethod();
		rc.publicMethod();
		
		Robot robot = new Robot();
		
	}
}
