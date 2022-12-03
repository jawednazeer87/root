package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wap to find the index of an array element(here u have to take any number and check that number is 
		//present inside an array or not, 
	    //if 	not print -1, if present then print its index means of of that element)?
		int arr[]= {1,6,4,8,9,11,12,2};
		int size=arr.length;
		int num=11;
		int flag=0;
		int i;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println(num+" is present at index: "+i);
		}
		else {
			System.out.println("not found");
		}
		
		
		
	}

}
