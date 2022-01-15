package org.la.core.java.student.moshin.assignment5;

public class Assignment54 {
	
	public static void main(String[] args) {

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
