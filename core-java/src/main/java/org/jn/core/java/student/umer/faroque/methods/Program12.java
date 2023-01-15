/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program12 {

	/**
	 * @param args
	 */
	static int[] addTwoArrays(int[] a,int[] b) {
		int[] c=new int[a.length];
		for(int i=1;i<a.length;i++) {
			
			c[i]=a[i]+b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		// int[] addTwoArrays(int[], int[]) - all array of same size
//		add two supplied arrays elements and then copy the some of each element to 3rd array and 
//		return 3rd array.
		int[] array = {-3, -1, 9, 0, -1, -1888};
		int[] newArray= {3,-1,-2,5,4,3690};
		int[] sumArray=addTwoArrays(array,newArray);
		int n=array.length;
		for(int i=0;i<n;i++) {
			System.out.println("Sum Array value at "+i+" is: "+sumArray[i]);
		}
		

	}

}
