package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class AverageOfArray {

	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Average of array is: "+averageOfArray(arr));
	}
	
	static float averageOfArray(int[] arr) {
		float total =0;
		for(int x:arr) {
			total += x;
		}
		return total / arr.length;
	}

}
