package org.jn.core.java.student.shoaeeb.dsa;

public class InsertionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,2,1,6};
		InsertionSort s  =new InsertionSort();
		s.insertionSort(arr, arr.length);
		s.printArray(arr, arr.length);
	}

}
