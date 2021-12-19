package org.la.core.java.student.tanseer.assignment4.loops;

public class Program23 {

	public static void main(String[] args) {
		int i = 10;
		
		while(i<=50) {
			if(i % 5 == 0 && i % 9 == 0)
				System.out.println(i);
			i++;
		}
	}

}
