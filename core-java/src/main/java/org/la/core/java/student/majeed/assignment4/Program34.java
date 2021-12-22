package org.la.core.java.student.majeed.assignment4;

public class Program34 {

	public static void main(String[] args) {
		// 34.	wap to print all upper case alphabets except vowels.
		char i = 'A';
		while(i<='Z') {
			if(i != 'A' && i!='E'&& i!='I' && i!='O' && i!='U')
			System.out.println(i);			
			i++;
		}
	}

}
