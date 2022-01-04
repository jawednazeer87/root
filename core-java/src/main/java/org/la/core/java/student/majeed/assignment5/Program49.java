package org.la.core.java.student.majeed.assignment5;

public class Program49 {

	public static void main(String[] args) {
		/*49)	what ArrayIndexOutOfBoundsException ?	- theory, search in google
		 */
		
		int[] arr1 = {10, 19, 2, 7};
		int count=0; 
		for(int i=0;i<=arr1.length;i++) {
			if(arr1[i] == 2)
				count += 1;
		}
			System.out.println(count);	
				
	}
}