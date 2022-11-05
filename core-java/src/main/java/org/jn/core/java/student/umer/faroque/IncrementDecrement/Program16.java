/**
 * 
 */
package org.jn.core.java.student.umer.faroque.IncrementDecrement;

/**
 * @author umerf
 *
 */
public class Program16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1;
		int y = 2;
		int z = --x * y++;		//-2*2
		System.out.println(x);//-2
		System.out.println(y);//3
		System.out.println(z);//-4
	}

}
