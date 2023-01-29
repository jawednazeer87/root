package org.jn.corejava.student.aameen.array;

public class Assignment14 {

	public static void main(String[] args) {
		// wap to find smallest number among array element
		
		System.out.println("The smallest number among array element : "+smallest());

	}
	static int smallest()
	{
		int arr[]= {100,2,34,45,6,7,8,90,};
		int small=arr[0];
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}return small;
		
	}
	

}
