package org.jn.core.java.jawed.loop;

public class WhileBreak {

	public static void main(String[] args) {

		int i = 1;
		
		while(i<=9) {
			if(i%5==0) {
				break;
			}
			System.out.println("Hi: "+i);
			i++;
		}
		
		System.out.println("end");
	}

}