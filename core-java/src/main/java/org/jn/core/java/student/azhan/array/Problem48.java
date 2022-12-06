package org.jn.core.java.student.azhan.array;

public class Problem48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,2,5,6,8};
		int count=0;
		for(int x:arr)
		{
			if(x==2)
				count++;
		}
		System.out.println("Number of 1's here: "+count);
	}

}
