package org.la.core.java.student.moshin.assignment5;

public class Assignment53 {
	
	public static void main(String[] args) {

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
