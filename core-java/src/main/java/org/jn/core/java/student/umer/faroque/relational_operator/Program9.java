/**
 * 
 */
package org.jn.core.java.student.umer.faroque.relational_operator;

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
		int a = -1;
		int b = 1;
		boolean x = ++a<=0 && ++b>1;	// 0 true 2 true ->false
		boolean y = --a > -2 || b-- < 1;//-1 true
		System.out.println(a);//-1
		System.out.println(b);//2
		System.out.println(x);//true
		System.out.println(y);//true
		

	}

}
