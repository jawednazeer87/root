/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

/**
 * @author umerf
 *
 */
public class Program18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
        int y = 10;
        double z = x++ - y * 7 / --y + x * 10;//20 - 70/9+ 210
        System.out.println(z);//223
	}

}
