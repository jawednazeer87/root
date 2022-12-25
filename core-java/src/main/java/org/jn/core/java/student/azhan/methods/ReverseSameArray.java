package org.jn.core.java.student.azhan.methods;

public class ReverseSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int a[] = reverse(arr);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+", ");
	}
	static int[] reverse(int src[])
	{
		int temp;
		for(int i=0; i<src.length/2; i++)
		{
			temp = src[src.length-1-i];
			src[src.length-1-i] = src[i];
			src[i] = temp;
		}
		return src;
	}

}
