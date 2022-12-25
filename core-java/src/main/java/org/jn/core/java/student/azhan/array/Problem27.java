package org.jn.core.java.student.azhan.array;

public class Problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40};
		int num=30;
		for(int i=0; i<arr.length; i++)
			if(arr[i] == num)
			{
				System.out.println("Found at index "+i);
				return;
			}
		System.out.println("-1");
	}

}
