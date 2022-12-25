package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	26) wap to test if an array contains a specific value?
		int arr[]= {5,6,7,8,12};
		int num=8;
		int flag=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				flag=1;
				break;
			}
				
		}
		if(flag==1)
		{
			System.out.println("present");
		}
		else {
			System.out.println("Not Present");
		}
	}

}
