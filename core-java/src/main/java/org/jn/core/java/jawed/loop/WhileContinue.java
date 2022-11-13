package org.jn.core.java.jawed.loop;

public class WhileContinue {

	public static void main(String[] args) {

		int i = 1;
		
		while(++i<=9) {
			if(i%5==0) {
				continue;
			}
			System.out.println("Hi: "+i);
		}
		
		System.out.println("end");
	}

}