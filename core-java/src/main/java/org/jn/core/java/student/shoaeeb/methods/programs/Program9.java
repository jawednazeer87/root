package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program9 {
	//find the average of elements and return average
	static int average(int arr[])
	{
		int n=arr.length;
		int sum=0;
		for(int ele: arr)
		{
			sum+=ele;
		}
		return sum/n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int avg = Program9.average(arr);
		System.out.println("Average:"+avg);
	}

}
