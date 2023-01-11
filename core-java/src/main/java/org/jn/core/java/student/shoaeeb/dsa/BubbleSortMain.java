package org.jn.core.java.student.shoaeeb.dsa;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,3,1,6,7};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr, arr.length);
		bs.printArray(arr, arr.length);
		
	}

}
