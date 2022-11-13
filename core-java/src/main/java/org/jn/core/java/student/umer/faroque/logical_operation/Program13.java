/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

/**
 * @author umerf
 *
 */
public class Program13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, e = 50;
        boolean b = (c == 1) || (++e < 100);//false 51 true
        System.out.println("e = " + e);//51
        boolean f = (e++ < 100) || (c == 1);
        System.out.println("e = " + e);//52
	}

}
