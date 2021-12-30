package org.la.core.java.student.sjmohammed.assignment4;

public class Example70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=200;n++) {
		int d=0;
		int t = n;
		while(t>0) {
			d++;
			t = t/10;
		}
		t=n;
		int res=0;
		while(t>0) {
			int r = t%10;
			res+=Math.pow(r, d);
			t=t/10;
		}
		if(res==n) {
			System.out.println("Amstrong Number "+n);
		}
		}
	}

}
