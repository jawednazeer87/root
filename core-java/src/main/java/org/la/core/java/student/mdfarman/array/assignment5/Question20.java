package org.la.core.java.student.mdfarman.array.assignment5;


public class Question20 {
	//		20) wap to check whether two array are equal or not
	//	(means we have to check each element of two arrays)?

	public static void main(String[] args) {

		int arr1[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		boolean flag = false;

		if(arr1.length == arr2.length) {
			for(int i = 0; i<arr1.length; i++) {
				for(int j = 0 ; j<arr2.length; j++) {
					if (arr1[i]==arr2[j]) {
						flag=true;
						break;
					}
					else {
						flag = false;
					}
				}
			}
		}
		
		if (flag == true)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");



	}
}
