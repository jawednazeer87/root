/**
 * 
 */
package org.jn.core.java.student.umer.faroque.ternary;

/**
 * @author umerf
 *
 */
public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// wap to print negative number among two given numbers( with if and without if).
		int num1=0,num2=10;
		System.out.println((num1<0)?num1:(num2<0)?num2:"both are positive");
		if(num1<0) {
			System.out.println("Num1 is negative");
		}else if(num2<0) {
			System.out.println("Num2 is negative");
		}else {
			System.out.println("Both are positive");
		}

	}

}
