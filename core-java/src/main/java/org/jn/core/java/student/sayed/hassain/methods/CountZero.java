package org.jn.core.java.student.sayed.hassain.methods;

public class CountZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 0, 1, 0, 0, 1, 1, 0 };
		int res = countZero(arr);
		System.out.println(res);
	}

	static int countZero(int arr[]) {
		int count = 0;
		for (int x : arr)
			if (x == 0)
				count++;
		return count;
	}

}
