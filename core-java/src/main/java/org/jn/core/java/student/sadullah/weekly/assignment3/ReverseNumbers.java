package org.jn.core.java.student.sadullah.weekly.assignment3;

public class ReverseNumbers {

	public static void main(String[] args) {

	    int n = 12345, reverse = 0;

        while(n != 0)
        {
            reverse = (reverse*10)+(n%10);
            n /= 10;
        }
        System.out.println("Reversed Number: "+reverse);
	}
}
