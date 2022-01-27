package org.la.core.java.student.mdfarman.method.assignment6;


public class Question6 {

	//	void copy(int[], int[])
	//	copy first array to second array



	void copy(int arr[], int arrcp[]) {
		for(int i=0;i<arr.length;i++)  {
          arrcp[i]= arr[i];
		}
		//print the copy arrays
		for(int i:arrcp)
			System.out.println(i);
	}


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arrcp[] = new int[arr.length];
		Question6 obj = new Question6();
		obj.copy(arr,arrcp);
	}

}
