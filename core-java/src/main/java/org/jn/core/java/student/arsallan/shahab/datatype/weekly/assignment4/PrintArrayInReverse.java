package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class PrintArrayInReverse {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		for(int arrayLength = array.length; arrayLength > 0; arrayLength--) {
			System.out.println(array[arrayLength-1]);
		}
	}

}
