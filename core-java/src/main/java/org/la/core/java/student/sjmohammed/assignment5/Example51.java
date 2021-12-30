package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 51) wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3
 */
public class Example51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100, 19, 2, 7, 50};
		int count=0;
			for(int i=0;i<a.length;i++) {
				boolean isPrime = true;
				for(int j=2;j<a[i];j++) {
					if(a[i]%j==0) {
						isPrime=false;
						break;
					}
					
				}
				if(isPrime) {
					count++;
			}
		}
			System.out.println("Prime number in the given number "+count);
	}
}
