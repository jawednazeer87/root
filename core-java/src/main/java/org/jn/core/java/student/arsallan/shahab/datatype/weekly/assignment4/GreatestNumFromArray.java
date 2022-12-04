package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class GreatestNumFromArray {

	public static void main(String[] args) {
		int array[] = {7,1,3,19,5,15,7,8,9};
		int greatestNum=0;
		
		for(int i=0;i<array.length - 1;i++) {
			if(array[i]>array[i+1] && greatestNum<array[i]) {
				greatestNum = array[i];
			}
		}
		
		System.out.println(greatestNum);
	}

}
