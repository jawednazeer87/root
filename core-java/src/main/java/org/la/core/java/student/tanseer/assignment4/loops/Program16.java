package org.la.core.java.student.tanseer.assignment4.loops;

public class Program16 {

	public static void main(String[] args) {
		int i = 120;
		while(i>=100) {
			if(i % 2 == 1)
				System.out.println(i);
			i--;
			if(i == 100)
				break;
		}
		
	}

}
