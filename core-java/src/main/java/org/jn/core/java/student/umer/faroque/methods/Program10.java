/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program10 {

	/**
	 * @param args
	 */
	static int greatest(int[] a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			max=a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// int greatest(int[])
//		find greatest element of an array and return that greatest value
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int max=greatest(array);
		System.out.println("The max of all elements in the array is: "+max);
	}

}
