package org.jn.core.java.jawed.cond;

public class PercentageInEfficient {
	
	public static void main(String[] args) {
		
		int p = 55;
		if(p>=60) {
			System.out.println("1st");
		}
		if(p>=50 && p<60) {
			System.out.println("2nd");
		}
		if(p>=40 && p<50) {
			System.out.println("3rd");
		}
		if(p<40) {
			System.out.println("Fail");
		}
	}

}
