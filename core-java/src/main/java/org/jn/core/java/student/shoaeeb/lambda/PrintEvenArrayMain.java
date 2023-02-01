package org.jn.core.java.student.shoaeeb.lambda;

public class PrintEvenArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		PrintEvenArrayInterface pr = (n)-> { return true; };
		for(int ele: arr)
		{
			if(pr.printArray(ele))
				{
				System.out.println(ele);
				}
		}
		pr=(n)-> { return n%2==0; };
		System.out.println("Even numbers in the array are:");
		for(int ele: arr)
		{
			if(pr.printArray(ele))
			{
				System.out.println(ele);
			}
		}
	}

}
