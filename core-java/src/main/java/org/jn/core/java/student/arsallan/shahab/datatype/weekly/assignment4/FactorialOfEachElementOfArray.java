package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class FactorialOfEachElementOfArray {

	public static void main(String[] args) {
		int array[] = {3,2,1,4,7,6,5,8,9,3,4};
		
		for(int x:array) {
			int  factorial = 1;
			for(int i=1;i<=x;i++) {
				factorial *=i;
			}
			System.out.println("factorials of "+ x +" is: "+factorial);
		}
	}

}
