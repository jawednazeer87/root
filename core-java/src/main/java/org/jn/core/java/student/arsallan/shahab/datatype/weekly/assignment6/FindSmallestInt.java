package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class FindSmallestInt {

	public static void main(String[] args) {
		int[] arr = {1,2,3,-4,5,-6};
		System.out.println("smallest num is: "+smallestInt(arr));
	}
	
	static int smallestInt(int[] arr) {
		int smallestNum = 0;
		for(int i:arr) {
			if(i<smallestNum) {
				smallestNum = i;
			}
		}
		return smallestNum;
	}

}
