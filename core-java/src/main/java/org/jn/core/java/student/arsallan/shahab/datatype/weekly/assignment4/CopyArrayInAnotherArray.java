package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class CopyArrayInAnotherArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		int newArray[] = new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			newArray[i]=array[i];
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(newArray[i]);
		}
	}

}
