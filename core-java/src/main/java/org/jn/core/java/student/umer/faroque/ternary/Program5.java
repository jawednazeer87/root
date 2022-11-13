/**
 * 
 */
package org.jn.core.java.student.umer.faroque.ternary;

/**
 * @author umerf
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// wap to print even number among two given numbers( with if and without if).
		int num1=5,num2=0;
		System.out.println((num1%2==0)? "Num1 is even numbe":(num2%2==0)?"num2 is even":"both are odd");
		if(num1%2==0) {
			System.out.println("num1 is even");
		}else if(num2%2==0){
			System.out.println("num2 is even");
		}else {
			System.out.println("both are odd");
		}

	}

}
