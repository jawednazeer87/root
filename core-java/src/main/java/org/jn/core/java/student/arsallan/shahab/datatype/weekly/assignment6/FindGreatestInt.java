package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class FindGreatestInt {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Greatest num is: "+greatestInt(arr));
	}
	
	static int greatestInt(int[] arr) {
		int greatestNum = 0;
		for(int i:arr) {
			if(i>greatestNum) {
				greatestNum = i;
			}
		}
		return greatestNum;
	}

}
