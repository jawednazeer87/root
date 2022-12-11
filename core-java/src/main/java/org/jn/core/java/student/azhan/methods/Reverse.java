package org.jn.core.java.student.azhan.methods;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int a[] = reverse(arr);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+", ");
	}
	static int[] reverse(int src[])
	{
		int a[] = new int[src.length];
		for(int i=0; i<a.length; i++)
			a[a.length-1-i] = src[i];
		return a;
	}

}
