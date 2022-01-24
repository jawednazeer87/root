package org.la.core.java.student.datatype.Sahil;

public class c79 {
	public static void main(String[] args) {
		int n = 3;
		for(int i =-n;i<=n;i++) {
			int a =i;
		if(a<0) {
			a= -a;
		}
			// printing space
		for (int b=1;b<=a;b++) {
			System.out.print(" ");
		}
			// printing star
		for(int b=0; b<=n-a;b++) {
			System.out.print("* ");
		}
		System.out.println("");
		}

	}
}
