package org.la.core.java.student.sjmohammed.assignment4;

public class Example71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int s=0;
		for(int n=1;n<=407;n++) {
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
				s+=n;
			}
		}
		System.out.println("Sum of Amstrong number "+s);		
	}	
}
