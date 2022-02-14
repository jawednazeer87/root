package org.la.core.java.student.wang.assignment6;

import java.util.Scanner;

public class Assignment131 {
    /*
  131
	int checkChar(char c)
		return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
     */
    public static int checkChar(char c) {
        int result;
        if (c >= 'A' && c <= 'Z') {
            result = 1;
        } else if (c >= 'a' && c <= 'z') {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input char : ");
        char c=scanner.next().charAt(0);
        System.out.println("checkChar(c) = " + checkChar(c));
    }
}