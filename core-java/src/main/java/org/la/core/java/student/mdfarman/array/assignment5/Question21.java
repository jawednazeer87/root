package org.la.core.java.student.mdfarman.array.assignment5;


public class Question21 {
	//			21) wap to print all prime numbers from an array ?


	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};		

		for (int i = 0 ; i < arr.length; i++) {
			int num = arr[i];
			boolean flag = false;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num + " is a prime number.");
		}

	}
}
