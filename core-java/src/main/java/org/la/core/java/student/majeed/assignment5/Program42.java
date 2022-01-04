package org.la.core.java.student.majeed.assignment5;

public class Program42 {

	public static void main(String[] args) {
		/*41) wap to convert an array of characters from upper case to lower case, e.g if arr[] = {'A', 'B', 'C'} 
		then after conversion final array should be arr[] = {'a', 'b', 'c'}
		 */
		
		char[] arr1 = {'A', 'B', 'C'};
				
		for(int i=0;i<arr1.length;i++) {
			arr1[i] += 32;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}