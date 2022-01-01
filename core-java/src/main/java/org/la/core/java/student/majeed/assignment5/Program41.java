package org.la.core.java.student.majeed.assignment5;

public class Program41 {

	public static void main(String[] args) {
		/*41) wap to convert an array of characters from lower case to upper case, e.g if arr[] = {'a', 'b', 'c'} 
		then after conversion final array should be arr[] = {'A', 'B', 'C'}
		 */
		
		char[] arr1 = {'a', 'b', 'c'};
				
		for(int i=0;i<arr1.length;i++) {
			arr1[i] -= 32;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}