/**
 * 
 */
package org.jn.core.java.student.umer.faroque.relational_operator;

/**
 * @author umerf
 *
 */
public class Program8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -4;
		int b = 0;
		boolean x = a< -5 && b==4;	// false and false -> false
		boolean y = --a > -6 || b-- < -1;//-5 true 0
		System.out.println(a);//-5
		System.out.println(b);//0
		System.out.println(x);//false
		System.out.println(y);//true
		
	}

}
