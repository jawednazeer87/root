package org.jn.core.java.jawed.loop;

public class Armstrong {
	
	public static void main(String[] args) {
		int n = 407;
		int d = 0;
		int t = n;
		while(t>0) {
			d++;
			t = t/10;
		}
		t = n;
		int res = 0;
		while(t>0) {
			int r = t%10;
			res +=  Math.pow(r, d); 
			t = t/10;
		}
		if(res==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}
}