package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 52)	wap to add all elements of an array and check wether the sum is a prime number or not?
		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
		Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number
 */
public class Example52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 8, 2, 9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		boolean isPrime=true;
		for(int j=2;j<sum;j++) {
			if(sum%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Sum of the number is Prime "+sum);
		}else {
			System.out.println("Sum of the number is not Prime "+sum);
		}
	}

}
