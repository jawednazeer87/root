package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment5;

public class PrintNumIfPresentInArray {

	static boolean checkNum(int[] arr,int num) {
		boolean isPresent = false;
		for(int x:arr) {
			if(x==num) {
				isPresent = true;
				break;
			}else {
				isPresent = false;
			}
		}
		return isPresent;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int num = 99;
		boolean result = checkNum(arr, num);
		System.out.println(result ? "yes it is present": "it is not in the array");

	}

}
