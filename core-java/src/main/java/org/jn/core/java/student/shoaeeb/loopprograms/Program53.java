package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	53)	wap to find whether an array of characters having 'a' or not?
		char arr[] = {'a','5','7','9'};
		int counter=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=='a')
			{
				counter=1;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("a is found");
		}
		else {
			System.out.println("Not found");
		}
	}

}
