package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintPostiveInt {

	public static void main(String[] args) {
		int[] arr = {2,-1,4,-7,-86};
		printPositive(arr);

	}
	
	static void printPositive(int[] arr) {
		for(int x:arr) {
			if(x>0) {
				System.out.println(x);
			}
		}
	}

}
