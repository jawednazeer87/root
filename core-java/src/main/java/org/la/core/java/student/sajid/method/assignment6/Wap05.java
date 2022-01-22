package org.la.core.java.student.sajid.method.assignment6;

public class Wap05 {

	public static void main(String[] args) {
		// 5) void printNum(int[], int)
		//method will print number if found in array negative number from supplied array
		//e.g. if a[]={1,2,3} n b=2 then print 2
		//if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element

		int arr[] = {2,4,6,8,10};
		
		printNum(arr,2);
	}
	
		static void printNum(int[] arr,int i) {
			
			boolean isFound = false;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					isFound = true;
				}
			}
			if(isFound) {
			System.out.println("Given Number "+i+" is in the array");
			}else {
			System.out.println("Given number "+i+" is not in the array");
			}
		}
}
