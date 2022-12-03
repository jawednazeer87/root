package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?
		int arr[]= {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		boolean flag=true;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=arr1[i])
			{
				flag=false;
				break;
			}
				
		}
		
		if(flag) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("They are not equal");
		}
	}

}
