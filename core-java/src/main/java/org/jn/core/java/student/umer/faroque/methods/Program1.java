/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program1 {

	/**
	 * @param args
	 */
	static void printNegative(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				System.out.println("Negative value found at "+i+" is: "+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// void printNegative(int[])
//		method will print all negative number from supplied array
		int[] array = {-3, -1, 9, 0, -1, -1888};
		printNegative(array);
	}

}
