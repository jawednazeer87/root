package org.la.core.java.student.tanseer.assignment4.loops;

public class Program35 {

	public static void main(String[] args) {
		
		for(char i = 97 ; i <= 122 ; i++) {
			if(i == 'a' ||i == 'e' ||i == 'i' ||i == 'o' ||i == 'u')
				continue;
			else
				System.out.println(i);
		}
	}

}
