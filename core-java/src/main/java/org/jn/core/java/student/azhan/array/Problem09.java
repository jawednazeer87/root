package org.jn.core.java.student.azhan.array;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,-6,4,-3,2,0};
		int x = 3;
		System.out.println("Numbers in array that are not divisible by "+x);
		for(int i=0; i<arr.length; i++)
			if(arr[i]%x!=0)
				System.out.println("arr["+i+"] = "+arr[i]);
	}

}
