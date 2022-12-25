package org.jn.core.java.student.azhan.array;

public class Problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,6,0,7,-2,0,7,0,-4};
		int count=0;
		for(int z:arr)
			if(z!=0)
				count++;
		int temp[] = new int[count];
		int j=0;
		for(int x: arr)
			if(x!=0)
			{
				temp[j++] = x;
				System.out.print(temp[j-1]+", ");
			}
			
		
		
//		int temp[] = new int[arr.length];
//		int j=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]==0)
//				continue;
//			temp[j++] = arr[i];
//		}
//		arr = new int[j];
//		for(int i=0; i<j; i++)
//		{
//			arr[i] = temp[i];
//			System.out.print(arr[i]+", ");
//		}
	}

}
