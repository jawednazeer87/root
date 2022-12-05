package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class CountOccurencesOfEachElement {
	
	public static void main(String[] args) {
		int array[] = {3,2,3,4,3,2,2,1,4,7,6,5,8,8,8,8,8,8,8,9,3,4};
		
		for(int i=0;i<array.length;i++) {
			int occ = 0;
			int el = array[i];
			for(int j=0;j<array.length;j++) {
				if(array[j]==el) {
					occ++;
				}
			}
			System.out.println(array[i]+" is "+occ+" times");
		}


	}
	
}
