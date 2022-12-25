/**
 * 
 */
package org.jn.core.java.jawed.clss;
import org.jn.core.java.jawed.model.Robot;
import org.jn.core.java.jawed.model.RobotChild;

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
