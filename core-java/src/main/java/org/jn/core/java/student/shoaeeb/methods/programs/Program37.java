package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program37 {
	//add two arrays and copy it to third array
	static int[]addTwoArrays(int []a, int []b)
	{
		int newArray[]  = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			newArray[i]=a[i]+b[i];
		}
		return newArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int newArray[]=Program37.addTwoArrays(a, b);
		for(int ele: newArray)
		{
			System.out.println(ele);
		}
	}

}
