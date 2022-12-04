package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class PrintPositiveNumOnly {

	public static void main(String[] args) {
		int array[] = {1,-2,3,4,-5,6,-7,8,-9};
		for(int x:array) {
			if(x>0) {
				System.out.println(x);
			}
		}
	}

}
