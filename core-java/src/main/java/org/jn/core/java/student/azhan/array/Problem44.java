package org.jn.core.java.student.azhan.array;

public class Problem44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length; i++)
			arr[i] = arr[i]/2;
		for(int x:arr)
			System.out.print(x+", ");
	}

}
