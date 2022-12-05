package org.jn.core.java.student.azhan.array;

public class Problem51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,5,2,9,13,19,18,17};
		int count=0,f;
		for(int i=0; i<arr.length; i++)
		{
			f=0;
			for(int j=2; j<=arr[i]/2; j++)
			{
				if(arr[i]%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0 && arr[i]!=1)
				count++;
		}
		System.out.print("Count = "+count);
	}

}
