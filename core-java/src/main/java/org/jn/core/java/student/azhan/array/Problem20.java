package org.jn.core.java.student.azhan.array;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4};
		int arr2[] = {1,2,3,4};
		int f=0;
		if(arr1.length != arr2.length)
			f=1;
		else
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					f=1;
					break;
				}
			}
		}
		if(f==0)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}

}
