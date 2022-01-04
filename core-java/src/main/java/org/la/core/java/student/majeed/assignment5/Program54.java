package org.la.core.java.student.majeed.assignment5;

public class Program54 {

	public static void main(String[] args) {
		/* 	54)	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
		 */
		char[] arr1 = {'A', '5', 'Z', 'p'};
		int count = 0;
		for(int m=0;m<arr1.length;m++) {
			if(arr1[m]=='Z') {
				count++;
			}
		}	
		if(count>0) {
			System.out.println("this array has 'Z'");
		}else
			System.out.println("this array doesn't have 'Z'");
			
	}
}
