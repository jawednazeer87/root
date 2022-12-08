package org.jn.core.java.student.azhan.methods;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,1,10};
		int s = average(arr);
		System.out.println("Average = "+s);
	}
	
	static int average(int arr[])
	{
		int sum=0;
		for(int x:arr)
			sum = sum + x;
		return sum/arr.length;
	}

}
