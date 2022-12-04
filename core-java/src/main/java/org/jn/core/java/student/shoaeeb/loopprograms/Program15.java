package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15) wap to find smallest number among array element
		int arr[]= {5,1,6,2,3,11};
		int minEle=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<minEle)
			{
				minEle=arr[i];
			}
		}
		
		System.out.println(minEle);
	}

}
