package org.la.core.java.student.majeed.assignment6;

public class Program23 {

	public static void main(String[] args) {
		/*
		boolean prime(int)
		check whether given number is prime or not and return true or false
		 */
		boolean c = prime(11);
		System.out.println(c);
	}
	
	static boolean prime(int a) {
		boolean k = true;
		for(int i=a-1;i>1;i--) {
			if(a%i==0) {
				k = false;
				break;
			}
		}
		return k;
	}	

}