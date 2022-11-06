/**
 * 
 */
package org.jn.core.java.student.umer.faroque.ternary;

/**
 * @author umerf
 *
 */
public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// wap to print smallest number among two given numbers( with if and without if).
		 int n1 = 5, n2 = 10;
		    System.out.println("Smaller number: "+ ((n1 < n2) ? n1 : n2));
		    if(n1<n2) {
		    	System.out.println("smaller is "+n1);
		    }else {
		    	System.out.println("smaller is "+n2);
		    }
	}

}
