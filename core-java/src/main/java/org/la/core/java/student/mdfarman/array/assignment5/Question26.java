package org.la.core.java.student.mdfarman.array.assignment5;


public class Question26 {
	//	26) wap to test if an array contains a specific value?

	public static void main(String[] args) {

		int arr[] = {8,4,5,7,6,5,4,9,8,5,2,4,5,8,4,5,2};
		int  specificValue = 8;
		boolean flag = false;
		
		for(int i = 0 ; i <  arr.length; i++) {
			if(arr[i] == specificValue) { 
				flag = true;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("Value present");
		else
			System.out.println("Not present");
		
	}
}
