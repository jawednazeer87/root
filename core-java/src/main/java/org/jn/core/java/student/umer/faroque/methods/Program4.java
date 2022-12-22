/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program4 {

	/**
	 * @param args
	 */
	static void printOdd(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.println("Odd value found at "+i+" is: "+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		//void printOdd(int[])
//		method will print all odd number from supplied array
		int[] array = {-3, -1, 9, 0, -1, -1888};
		printOdd(array);
	}

}
