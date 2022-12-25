package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	16) wap to reverse an array
		int arr[]= {1,2,3,4,5};
		int size=arr.length;
		for(int i=0; i<arr.length/2; i++)
		{
			int temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
