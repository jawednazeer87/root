package org.jn.core.java.student.azhan.methods;

public class PrintNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,6,-5,7,-9,-3,5};
		printNegative(arr);
	}
	static void printNegative(int arr[])
	{
		for(int x: arr)
			if(x<0)
				System.out.print(x+", ");
	}
}
