package org.la.core.java.student.sajid.loop;

public class Q28 {
	public static void main(String[] args) {
		for(int a=10;a<=300;a++) {
			if(a%11==0) {
				System.out.println("not divisible by 11: "+a);
			}
			System.out.println();
			if(a%12==0) {
				System.out.println("not divisible by 13: "+a);
			}
		}
	}

}
