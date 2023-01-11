package org.jn.core.java.student.shoaeeb.dsa;

public class BitManipulationChallenges {
	//subsets of a set
//	public static void subsets(int arr[],int n) 
//	{
//		for(int i=0; i<(1<<n); i++)
//		{
//			for(int j=0; j<n; j++)
//			{
//				if(i & (1<<j))
//				{
//					System.out.println(arr[j]+" ");
//				}
//			}System.out.println();
//		}
//	}
	
	public static int numberOfOnes(int n)
	{
		int count=0;
		while(n!=0)
		{
			n = (n & n-1);
			count++;
		}
		return count;
	}
	
	public static int isPowerOfTwo(int n)
	{
		return  (n & (n & n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPowerOfTwo(15)==0)
		{
			System.out.println("Power of 2");
		}
		else {
			System.out.println("Not Power of 2");
		}
		
		//count the number of 1s
		System.out.println(numberOfOnes(19));
	}

}
