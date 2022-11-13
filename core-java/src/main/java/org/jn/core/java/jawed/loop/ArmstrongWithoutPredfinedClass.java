package org.jn.core.java.jawed.loop;

public class ArmstrongWithoutPredfinedClass {
	
	public static void main(String[] args) {
		int n = 331;
		int d = n;
		int res = 0;
		while(d>0) {
			int r = d % 10;
			d = d / 10;
			res = res + r * r * r;
			 
		}
		if(res==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}
}