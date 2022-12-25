package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','7','5','p'};
		int counter=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=='Z')
			{
				counter=1;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("Z is found");
		}
		else {
			System.out.println("Not found");
		}
	}

}
