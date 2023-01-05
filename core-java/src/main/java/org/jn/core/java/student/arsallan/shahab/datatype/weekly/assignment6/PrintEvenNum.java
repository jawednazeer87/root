package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintEvenNum {

	public static void main(String[] args) {
		int[] arr = {2,-1,4,-7,-86};
		printEven(arr);

	}
	
	static void printEven(int[] arr) {
		for(int x:arr) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
	}

}
