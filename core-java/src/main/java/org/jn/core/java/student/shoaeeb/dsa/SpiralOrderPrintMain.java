package org.jn.core.java.student.shoaeeb.dsa;

public class SpiralOrderPrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralOrderPrint sp = new SpiralOrderPrint();
		int arr[][]= {
				{1,2,3,11},{4,5,6,12},{7,8,9,13}
		};
		sp.spiralPrintArray(arr, arr.length-1, arr[0].length-1);
		
	}

}
