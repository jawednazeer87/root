package org.la.core.java.student.sajid.array;

public class Q53 {
	public static void main(String[] args) {
		/* 	53)	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
		 */
		char[] arr1 = {'a', '5', '7', 'p'};
		int count = 0;
		for(int m=0;m<arr1.length;m++) {
			if(arr1[m]=='a') {
				count++;
			}
		}	
		if(count>0) {
			System.out.println("this array has 'a'");
		}else
			System.out.println("this array doesn't have 'a'");
			
	}

}
