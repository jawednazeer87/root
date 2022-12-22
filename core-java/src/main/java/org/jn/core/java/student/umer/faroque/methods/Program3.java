/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program3 {

	/**
	 * @param args
	 */
	static void printEven(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even value found at "+i+" is: "+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// void printEven(int[])
//		method will print all even number from supplied array
		int[] array = {-3, -1, 9, 0, -1, -1888};
		printEven(array);
	}

}
