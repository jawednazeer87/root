package org.jn.core.java.student.azhan.methods;

public class PrintOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,2,6,45,32,6,7,9};
		printOdd(arr);
	}
	static void printOdd(int arr[])
	{
		for(int x:arr)
			if(x%2!=0)
				System.out.print(x+", ");
	}

}
