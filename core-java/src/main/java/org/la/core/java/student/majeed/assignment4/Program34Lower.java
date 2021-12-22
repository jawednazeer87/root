package org.la.core.java.student.majeed.assignment4;

public class Program34Lower {

	public static void main(String[] args) {
		// 34.	wap to print all lower case alphabets except vowels.
		char i = 'a';
		while(i<='z') {
			if(i != 'a' && i!='e'&& i!='i' && i!='o' && i!='u')
			System.out.println(i);			
			i++;
		}
	}

}
