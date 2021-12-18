package org.la.core.java.student.tanseer.assignment4.loops;

public class Program38NumbersExcept3And7 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 3 || i == 7)
				continue;
			else
				System.out.println(i);
		}
	}

}
