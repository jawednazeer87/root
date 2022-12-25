package org.jn.core.java.student.azhan.array;

public class Problem36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {20, 20, 30, 40, 50, 50, 50};
		int size = duplicate(arr1);
		System.out.println("Size of the new array = "+size);
		
	}
	static int duplicate(int arr1[]) {
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
//		for(int i=0; i<size; i++)
//			System.out.print(arr2[i]+", ");
		return size;
	}

}
