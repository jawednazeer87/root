package org.jn.core.java.student.azhan.array;

public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,10,30};
		int num=10, size=arr.length;
		for(int i=0; i<size; i++)
		{
			if(arr[i] == num)
			{
				for(int j=i; j<size-1; j++)
					arr[j] = arr[j+1];
				size--;
				break;
			}
		}
		for(int i=0; i<size; i++)
			System.out.print(arr[i]+", ");
	}

}
