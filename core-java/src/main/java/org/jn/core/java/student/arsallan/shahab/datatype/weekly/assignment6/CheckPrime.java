package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println("is 11 is prime: "+prime(11));
	}
	
	static boolean prime(int a) {
		boolean isPrime = false;
		if(a==2) {
			return !isPrime;
		}
		for(int i=2; i<a;i++) {
			if(a%i==0) {
				return isPrime;
			}
			if(i == (a - 1)) {
				return !isPrime;
			}
		}
		return isPrime;
	}

}
