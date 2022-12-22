/**
 * 
 */
package org.jn.core.java.student.umer.faroque.methods;

/**
 * @author umerf
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	static void printNum(int[] arr,int num) {
		int n= arr.length;
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Key not found");
		}else {
			System.out.println(num+" found ");
		}
	}
	public static void main(String[] args) {
		// void printNum(int[], int)
//		method will print number if found in array negative number from supplied array
//		e.g. if a[]={1,2,3} n b=2 then print 2
//		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element
		int[] array = {-3, -1, 9, 0, -1, -1888};
		printNum(array,6);
	}

}
