package org.jn.core.java.student.azhan.array;

public class Problem38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int gr=arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i] > gr)
				gr = arr[i];
		System.out.println("Greatest number = "+gr);
		
		int sm=arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i] < sm)
				sm = arr[i];
		System.out.println("Smallest number = "+sm);
	}

}
