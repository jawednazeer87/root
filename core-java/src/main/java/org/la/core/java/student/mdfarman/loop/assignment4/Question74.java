package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question74 {

	//	 74.	Wap to print all Strong numbers between 1 to n.


	public static void main(String[] args) {

		int limit = 5000;
		for(int j = 0 ; j<limit; j++) {

			int num = j;
			int sum = 0;
			int tempNum = num;

			while(tempNum!=0) {
				int rem = tempNum%10;
				int fact = 1;

				for(int i = 1 ; i<=rem; i++) {
					fact = fact  * i;
				}
				sum = sum+fact;
				tempNum /= 10;
			}
			if (num == sum)
				System.out.println(sum);
		}

	}
}