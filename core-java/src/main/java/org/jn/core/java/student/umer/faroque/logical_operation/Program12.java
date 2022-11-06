/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

/**
 * @author umerf
 *
 */
public class Program12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, e = 50;
        boolean b = (c == 1) && (++e < 100);//false true -> false
        System.out.println("e = " + e);//50
        boolean f = (++e < 100) && (c == 1);//51 true and false
        System.out.println("e = " + e);//51

	}

}
