package org.jn.core.java.Sahil;

public class a1 {

	static void printOddArray(int[] arr) {
		for(int x:arr) {
			if(x%2!=0) {
				System.out.print(x + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,-9,34,-9};
		printOddArray(arr);
	}


}


