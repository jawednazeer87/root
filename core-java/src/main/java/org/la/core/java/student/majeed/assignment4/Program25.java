package org.la.core.java.student.majeed.assignment4;

public class Program25 {

	public static void main(String[] args) {
		// 25.	wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
		for(int i=100;i>=1;i--) {
			if(i%11 != 0 && i%3 != 0)
			System.out.println(i);	
		}
	}

}
