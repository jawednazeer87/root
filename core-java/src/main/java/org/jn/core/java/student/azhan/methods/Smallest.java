package org.jn.core.java.student.azhan.methods;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,1,10};
		int s = smallest(arr);
		System.out.println("Smallest = "+s);
	}
	
	static int smallest(int arr[])
	{
		int s=arr[0];
		for(int x:arr)
			if(x<s)
				s=x;
		return s;
	}

}
