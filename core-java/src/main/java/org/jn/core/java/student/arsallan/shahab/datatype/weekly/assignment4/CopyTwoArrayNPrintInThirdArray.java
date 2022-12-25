package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class CopyTwoArrayNPrintInThirdArray {

	public static void main(String[] args) {
		int arrayOne[] = {1,2,3,4,5,6,7,8,9};
		int arrayTwo[] = {10,11,12,13,14,15,16,17};
		int finalArrayLength = arrayOne.length + arrayTwo.length;
		int finalArray[]= new int[finalArrayLength];
		
		for(int i=0; i<finalArrayLength;i++) {
			if(i<arrayOne.length) {
				finalArray[i]=arrayOne[i];
			}else {
				finalArray[i]=arrayTwo[i - (arrayOne.length )];
			}
		}
		
		for(int x:finalArray) {
			System.out.println(x);
		}
	}

}
