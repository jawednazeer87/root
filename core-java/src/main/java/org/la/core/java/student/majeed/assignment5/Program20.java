package org.la.core.java.student.majeed.assignment5;

public class Program20 {

	public static void main(String[] args) {
		//20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,30,40,60};
		boolean arraysAreEqual = true;
		
		if(arr1.length == arr2.length) {
		for(int i=0; i<arr1.length;i++) {
			
			if (arr1[i] != arr2[i]) {
				arraysAreEqual = false;
				break;
			}
		}
		} else {
			arraysAreEqual = false;
		}
		if(arraysAreEqual==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}
