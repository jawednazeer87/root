package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int arrayOne[] = {1,2,3,4,5,6,7,8,9};
		int arrayTwo[] = {10,11,1,13,3,15,8,17};
		
		for(int x:arrayOne) {
			for(int y:arrayTwo) {
				if(x==y) {
					System.out.println("duplicates are: "+x);
				}
			}
		}
	}

}
