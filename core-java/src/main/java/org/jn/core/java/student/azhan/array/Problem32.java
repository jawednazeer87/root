package org.jn.core.java.student.azhan.array;

public class Problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {194,1,2,2,3,1,194,-9,-21};
		int len = arr.length;
		for(int i=0; i<len-1; i++)
		{
			for(int j=0; j<len-i-1; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int i;
		for(i=0; i<len-1; i++)
		{
			if(arr[i]!=arr[i+1])
				break;
		}
		if(i+1<len)
			System.out.println("Second Greatest element = "+arr[i+1]);
		else
			System.out.println("No second greatest element found");
	}

}
