package org.la.core.java.student.sajid.loop;

public class Q27 {
	public static void main(String[] args) {
		for(int a=1;a<=1500;a++) {
			if(a%11==0) {
				System.out.println("not divisible by 11: "+a);
			}
			System.out.println();
			if(a%13==0) {
				System.out.println("not divisible by 13: "+a);
			}
		}
	}

}
