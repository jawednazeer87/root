package org.la.core.java.student.sajid.loop;

public class Q26 {
	public static void main(String[] args) {
		for(int a=200;a>=1;a--) {
			if(a%13==0) {
				System.out.println("divisible by 13: "+a);
			}
			System.out.println();
			if(a%2==0) {
				System.out.println("divisible by 2: "+a);
			}
		}
	}

}
