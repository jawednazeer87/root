/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program8 {

	/**
	 * @param args
	 */
	static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// int sum(int[])
//		find sum of all elements of an array and return sum
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int sum1=sum(array);
		System.out.println("The sum of all elements in the array is: "+sum1);
	}

}
