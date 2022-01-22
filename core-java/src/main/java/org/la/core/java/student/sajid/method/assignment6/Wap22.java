package org.la.core.java.student.sajid.method.assignment6;

public class Wap22 {

	public static void main(String[] args) {
		// 22)	boolean prime(int)
		//check whether given number is prime or not and return true or false
		
		int i=21;
		
		boolean isPrime = prime(i);
		
		System.out.println("Result: "+isPrime);
		
		if (isPrime) {
			System.out.println("Given number "+i+" is a prime number");
		}else {
			System.out.println("Given number "+i+" is not a prime number");
		}
	}
		
		static boolean prime(int a) {
			
			boolean isPrime = true;
			
			for(int i=2;i<=a/2;i++) {
				
				int rem = a%i;
				
				if(rem==0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;						
		}

}
