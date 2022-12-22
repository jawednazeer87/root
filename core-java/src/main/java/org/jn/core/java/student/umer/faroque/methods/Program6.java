/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program6 {

	/**
	 * @param args
	 */
	static void copy(int[] a,int [] b) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println("New Array value at "+i+" is: "+b[i]);
		}
	}
	public static void main(String[] args) {
		// void copy(int[], int[])
//		copy first array to second array
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int[] newArray= new int[array.length];
		copy(array,newArray);

	}

}
