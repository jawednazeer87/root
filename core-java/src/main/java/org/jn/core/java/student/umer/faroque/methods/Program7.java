/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program7 {

	/**
	 * @param args
	 */
	static int[] copy(int[] a) {
		int n=a.length;
		int [] b=new int[a.length];
		for(int i=0;i<n;i++) {
			b[i]=a[i];
		}
		return b;
		
	}
	public static void main(String[] args) {
		// int[] copy(int[])
//		create an array and copy supplied array and return that new array
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int[] newArray=copy(array);
		for(int i=0;i<newArray.length;i++) {
			System.out.println("New Array value at "+i+" is: "+newArray[i]);
		}
	}

}
