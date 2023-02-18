package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program2 {
	static void printPositive(int arr[]){
		
		for(int ele: arr)
		{
			if(ele>0)
			{
				System.out.println(ele);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,1,-1,6,-7,5,-4};
		Program2.printPositive(arr);
	}

}
