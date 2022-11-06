/**
 * 
 */
package org.jn.core.java.student.umer.faroque.ternary;

/**
 * @author umerf
 *
 */
public class Program6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// wap to print even number among two given numbers( with if and without if).
				int num1=2,num2=5;
				System.out.println((num1%2==1)? "Num1 is odd number":(num2%2==1)?"num2 is odd":"both are even");
				if(num1%2==1) {
					System.out.println("num1 is odd");
				}else if(num2%2==1){
					System.out.println("num2 is odd");
				}else {
					System.out.println("both are even");
				}
	}

}
