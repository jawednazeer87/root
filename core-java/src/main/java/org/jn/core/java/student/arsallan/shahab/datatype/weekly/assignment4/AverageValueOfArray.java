package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class AverageValueOfArray {

	public static void main(String[] args) {
		float array[] = {3,2,1,4,7,6,5,8,9,3,4};
		float total=0;
		
		for(float x:array) {
			total+=x;
		}
		
		System.out.println(total/array.length);

	}

}
