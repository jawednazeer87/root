package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program5 {
	//	5.	void printNum(int[], int), method will print number if found in array from supplied array
	static void printNum(int arr[] ,int x)
	{
		boolean found=false;
		for(int ele: arr)
		{
			if(ele==x)
			{
				
				System.out.println(ele);
				found=true;
			}
		}
		if(!found)
		{
			System.out.println(x+ " is not found on the array");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		int x=3;
		Program5.printNum(arr, x);
		 x=5;
		 Program5.printNum(arr, x);
	}

}
