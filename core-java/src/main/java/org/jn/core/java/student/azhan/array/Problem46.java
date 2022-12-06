package org.jn.core.java.student.azhan.array;

public class Problem46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,2,5,6,1,8};
		int sum =0;
		for(int x:arr)
		{
			if(x%2!=0)
				sum=sum+x;
		}
		System.out.println("Sum = "+sum);
	}

}
