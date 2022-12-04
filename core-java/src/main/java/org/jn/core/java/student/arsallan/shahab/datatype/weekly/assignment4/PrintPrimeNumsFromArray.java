package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class PrintPrimeNumsFromArray {

	public static void main(String[] args) {
		int array[] = {3,2,1,4,7,6,5,8,9,11,12,13,17};

		for(int x:array) {
			for(int i=2; i < x ;i++) {
				if(x%i==0) {
					break;
				}
				if(x%i != 0) {
					if(i+1==x) {
						System.out.println("prime num: "+x);
					}
				}
			}
		}
		
	}

}
