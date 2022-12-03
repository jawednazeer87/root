package org.jn.core.java.student.azhan.array;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,3,7,3,6,7};
		int f;
		System.out.println("Duplicate Elements:");
		for(int i=0; i<arr.length; i++)
		{
			f=0;
			for(int k=0; k<i; k++)
			{
				if(arr[i] == arr[k])
				{
					f=1;
					break;
				}
			}
			if(f==1)
				continue;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+", ");
					break;
				}
			}
		}

	}

}
