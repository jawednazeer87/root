package org.jn.core.java.student.azhan.array;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,6,4,3,2,0};
		System.out.println("Even Numbers:");
		for(int i=0; i<arr.length; i++)
			if(arr[i]%2==0)
				System.out.println("arr["+i+"] = "+arr[i]);
	}

}