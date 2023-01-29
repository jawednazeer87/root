package org.jn.core.java.student.shoaeeb.arrays;

public class FindFirstAndLast {
	
	static int binarySearch(int arr[],int target,boolean firstOccurence)
	{
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(target>arr[mid])
			{
				low=mid+1;
			}
			else if(target<arr[mid])
			{
				high=mid-1;
			}
			else {
				ans=mid;
				if(firstOccurence)	
				{
					high=mid-1;
				}
					
				else 
				{
					low=mid+1;
				}
			}
					
			 
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,7,8,9};
		int ans=binarySearch(arr,7,true);
		int ans2=binarySearch(arr,7,false);
		System.out.println(ans+" "+ans2);
	}

}
