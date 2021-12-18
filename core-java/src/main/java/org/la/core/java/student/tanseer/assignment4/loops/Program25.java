package org.la.core.java.student.tanseer.assignment4.loops;

public class Program25 {

	public static void main(String[] args) {
		
		int i = 100;
		
		for(; i>=1 ; i--) {
			if(i % 11 !=0 && i % 3 != 0)
				System.out.println(i);
		}
	}

}
