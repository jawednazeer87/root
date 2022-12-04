package org.jn.core.java.student.azhan.array;

public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {4,6,3,2,4,547,7,78,3,90};
		int arr2[] = new int[arr1.length], j=0;
		for(int x:arr1)
			if(x%2==0)
				arr2[j++] = x;
		for(int x:arr1)
			if(x%2!=0)
				arr2[j++] = x;
		for(int x:arr2)
			System.out.print(x+", ");
		
	}

}
