package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	09) wap to print number not divisible by given number from an array
		int arr[]= {1,2,6,3,5,9};
		int num=2;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%num!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
