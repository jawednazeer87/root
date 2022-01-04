package org.la.core.java.student.sjmohammed.assignment4;

public class Example69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int d=0;
		int t = n;
		while(t>0) {
			d++;
			t = t/10;
		}
		t=n;
		int res=0;
		while(t>n) {
			int r = t%10;
			res+=Math.pow(r, d);
			t=t/10;
		}
		if(res==n) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number");
		}
	}

}
