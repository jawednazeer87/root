package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	14) wap to find greatest number from any array 
		int arr[]= {5,1,6,2,3,11};
		int maxEle=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>maxEle)
			{
				maxEle=arr[i];
			}
		}
		
		System.out.println(maxEle);
	}

}
