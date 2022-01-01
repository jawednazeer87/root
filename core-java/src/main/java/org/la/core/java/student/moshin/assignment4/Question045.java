package org.la.core.java.student.moshin.assignment4;

public class Question045 
{
	//45.	wap to print patterns
    public static void main(String[] args) {

        int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * * * ");
            }
            System.out.println();
        }
   }
}

