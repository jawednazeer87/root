package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		int num = 79;
		boolean isPrime = true;
		if(num ==1) {
			System.out.println("1 is neither prime nor composite number");
		}
		if(num>1) {
			for(int i=2; i < num; i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num + " is a prime number");
			}else if(!isPrime) {
				System.out.println(num + " is not a prime number");
			}
		}
	}

}
