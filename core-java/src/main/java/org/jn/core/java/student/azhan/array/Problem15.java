package org.jn.core.java.student.azhan.array;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int sm=arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i] < sm)
				sm = arr[i];
		System.out.println("Smallest number = "+sm);
	}

}
