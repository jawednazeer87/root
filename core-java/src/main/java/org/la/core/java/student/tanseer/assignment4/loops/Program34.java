package org.la.core.java.student.tanseer.assignment4.loops;

public class Program34 {

	public static void main(String[] args) {
		
		for(char i = 65 ; i <= 90 ; i++) {
			if(i == 'A' ||i == 'E' ||i == 'I' ||i == 'O' ||i == 'U')
				continue;
			else
				System.out.println(i);
		}
	}

}
