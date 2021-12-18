package org.la.core.java.student.tanseer.assignment4.loops;

public class Program39 {

	public static void main(String[] args) {
		//wap to print all numbers from 1 to 10 except 2 and 5 and 8.
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 2 || i == 5 || i == 8)
				continue;
			else
				System.out.println(i);
		}
	}

}
