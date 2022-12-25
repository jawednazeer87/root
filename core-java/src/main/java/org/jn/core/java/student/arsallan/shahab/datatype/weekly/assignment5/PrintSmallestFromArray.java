package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment5;

public class PrintSmallestFromArray {

	static int SmallestNumFromArray(int[] arr) {
		int Smallest=0;
		for(int x:arr) {
			if(x<Smallest) {
				Smallest = x;
			}
		}
		return Smallest;
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,1,34,-9};
		System.out.println("Smallest num from array is "+ SmallestNumFromArray(arr));
	}

}
