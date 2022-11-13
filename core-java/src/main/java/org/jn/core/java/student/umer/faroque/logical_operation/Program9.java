/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

/**
 * @author umerf
 *
 */
public class Program9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;//false
        System.out.println("Lamp switch-on " + result);
        result = lampY || result;//true
        System.out.println("Lamp switch-on " + result);
	}

}
