/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

/**
 * @author umerf
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = false;
        boolean e = a || !b || c || !d;
		System.out.println(a);//true
		System.out.println(b);//true
		System.out.println(c);//true
		System.out.println(d);//false
		System.out.println(e);//true
	}

}
