package org.la.core.java.student.sajid.array.assignment5;

public class Wap35 {

	public static void main(String[] args) {
		// wap to check if an array of integers without 0 and -1?
		int[] arr1 = {1,2,3,4,5,6,0,17,0,16,-1,12};
		boolean temp = true;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]==0 || arr1[i]==-1)
				temp=false;
		}
			if(temp==true) {
			System.out.println("Array doesn't Contains 0 or -1");
			}else
				System.out.println("Array Contains 0 or -1");
						

	}

}