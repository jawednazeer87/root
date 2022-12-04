package org.jn.core.java.student.azhan.array;

public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40};
		int num=320;
		for(int i=0; i<arr.length; i++)
			if(arr[i] == num)
			{
				System.out.println("Found");
				return;
			}
		System.out.println("Not found");
	}

}
