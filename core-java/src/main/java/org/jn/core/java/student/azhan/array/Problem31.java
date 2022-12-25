package org.jn.core.java.student.azhan.array;

public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {0,2,3,5,3,3,3,5,7,7,5,7,6};
		int arr2[] = new int[arr1.length];
		int size=0,f;
		for(int i=0; i<arr1.length; i++) 
		{
			f=0;
			for(int j=0; j<size; j++)
			{
				if(arr1[i] == arr2[j])
				{
					f=1;
					break;
				}
			}
			if(f==0)
				arr2[size++] = arr1[i];
		}
		for(int i=0; i<size; i++)
			System.out.print(arr2[i]+", ");
	}

}
