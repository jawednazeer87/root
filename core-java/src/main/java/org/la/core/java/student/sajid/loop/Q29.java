package org.la.core.java.student.sajid.loop;

public class Q29 {
	public static void main(String[] args) {
		for(int a=100;a>=1;a--) {
			if(a%11==0) {
				System.out.println("divisible by 11: "+a);
			}
			System.out.println();
			if(a%3==0) {
				System.out.println("divisible by 3: "+a);
			}
		}
	}

}
