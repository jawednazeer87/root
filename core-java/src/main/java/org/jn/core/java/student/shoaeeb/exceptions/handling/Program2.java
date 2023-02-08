package org.jn.core.java.student.shoaeeb.exceptions.handling;

public class Program2 {

	static int arrayLength(int arr[])
	{
		return arr[2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		try {
			int n=Program2.arrayLength(arr);
			int a=45/n;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("array index is not applicable");
		}
	}

}
