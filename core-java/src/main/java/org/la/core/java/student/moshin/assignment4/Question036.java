package org.la.core.java.student.moshin.assignment4;

public class Question036 
{
	
	//36.	wap to print all upper case vowels.

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U')
                continue;
            System.out.println(i);
        }
	}
}

