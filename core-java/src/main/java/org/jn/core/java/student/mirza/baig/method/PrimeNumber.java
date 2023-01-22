package org.jn.core.java.student.mirza.baig.method;

public class PrimeNumber {


public static boolean prime(int n) {
	int i;
	
	for (i=2; i<n; i++) {
		if (n%i==0) {
			break;
		}
	}
	
		
	return i>n;
	
}
public static void main(String[] args) {
	
	

	
	prime(7);
}


	

	}


