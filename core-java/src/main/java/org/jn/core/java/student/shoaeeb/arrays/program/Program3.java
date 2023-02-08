package org.jn.core.java.student.shoaeeb.arrays.program;


public class Program3 {
	//sorting using bubble sort
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		int n=arr.length;
		int counter=1;
		while(counter<n)
		{
			for(int i=0; i<n-counter; i++)
			{
				if(arr[i]>arr[i+1])
				{

					int temp=arr[i];
					arr[i]=arr[i+1];
					 arr[i+1]=temp;				}
			}
			counter++;
		}
		
		for(int ele: arr)
		{
			System.out.println(ele);
		}
	}

}
