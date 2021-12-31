package org.la.core.java.student.majeed.assignment5;

public class Program27 {

	public static void main(String[] args) {
		/*27) wap to find the index of an array element(here u have to take any number and check that number is 
		present inside an array or not, 
	    if 	not print -1, if present then print its index means of that element)?
	    */
		
		int[] arr1 = {1,2,3,4,5,6,7};
		int specificValue = 6, i, indexValue = 0;
		boolean yes = false;
		for(i=0; i<arr1.length;i++) {
			if(arr1[i] == specificValue) {
				yes = true;
				indexValue = i;
				break;
			}
		}	if(yes == false) {
			System.out.println(-1);
		}else 
			System.out.println("Index Value is: "+indexValue);
	}
}
