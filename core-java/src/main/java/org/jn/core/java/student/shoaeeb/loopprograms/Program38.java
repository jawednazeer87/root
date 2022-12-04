package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//38) Find largest and smallest elements of an array? 
		int arr[]= {5,1,6,7,9,3};
		int maxEle = arr[0];
		int minEle=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>maxEle)
			{
				maxEle=arr[i];
			}
			if(arr[i]<minEle)
			{
				minEle=arr[i];
			}
		}
		
		System.out.println("Maximum: "+maxEle);
		System.out.println("Minimum:"+minEle);

	}

}
