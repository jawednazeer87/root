/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program11 {

	/**
	 * @param args
	 */
	static int smallest(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
			min=a[i];
		}
		return min;
	}
	public static void main(String[] args) {
		// int smallest(int[])
//		find smallest element of an array and return that smallest value
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int min=smallest(array);
		System.out.println("The min of all elements in the array is: "+min);

	}

}
