package org.jn.core.java.student.sayed.hassain.methods;

public class CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 1, 3, 2, 1, 1, 1 };
		int res = countOnes(arr);
		System.out.println(res);
	}

	static int countOnes(int arr[]) {
		int count = 0;
		for (int x : arr)
			if (x == 1)
				count++;
		return count;
	}

}
