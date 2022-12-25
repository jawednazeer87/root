package org.jn.core.java.student.azhan.methods;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,1,10};
		int s = sum(arr);
		System.out.println("Sum = "+s);
	}
	
	static int sum(int arr[])
	{
		int sum=0;
		for(int x:arr)
			sum = sum + x;
		return sum;
	}

}
