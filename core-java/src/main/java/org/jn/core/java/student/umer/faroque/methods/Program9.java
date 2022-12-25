/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program9 {

	/**
	 * @param args
	 */
	static int average(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		// int average(int[])
//		find the average of array elements and return average
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int avg=average(array);
		System.out.println("The avg of all elements in the array is: "+avg);
	}

}
