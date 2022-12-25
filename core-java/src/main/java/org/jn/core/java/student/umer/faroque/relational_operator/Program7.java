/**
 * 
 */
package org.jn.core.java.student.umer.faroque.relational_operator;

/**
 * @author umerf
 *
 */
public class Program7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;	// true && true 11 5 
		boolean y = --a==10 || b--<4;	// true or false 10 4
		System.out.println(a);//10
		System.out.println(b);//4
		System.out.println(x);//true
		System.out.println(y);//true
		
	}

}
