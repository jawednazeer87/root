/**
 * 
 */
package org.jn.core.java.student.umer.faroque.logical_operation;

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
		int a = 27 / 4 + 9;//15
        int b = 52 / 6 - 3;//5
        int c = 3;
        c = a++ - b; // 10    a=16
        a = a * b; //80
        b = b + a; //85
        a = (a < c) ? a % c : c % a; //10%80=10
        System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
