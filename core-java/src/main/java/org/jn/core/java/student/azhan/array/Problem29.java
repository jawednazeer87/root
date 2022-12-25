package org.jn.core.java.student.azhan.array;

public class Problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,20,40,30};
		int arr2[] = new int[arr1.length+1];
		int num=180, pos=6;
		int size=arr1.length;
		if(pos==0 || pos==size+2)
		{
			System.out.println("Position out of bond");
			return;
		}
		int j=0;
		for(int i=0; i<size; i++)
		{
			if(i==pos-1)
				arr2[j++] = num;
			arr2[j++] = arr1[i];
		}
		if(pos==size+1)
			arr2[j++] = num;
		for(int i=0; i<j; i++)
			System.out.print(arr2[i]+", ");
	}

}
