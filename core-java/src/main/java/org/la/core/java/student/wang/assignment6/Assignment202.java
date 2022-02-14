package org.la.core.java.student.wang.assignment6;

import java.util.Scanner;

public class Assignment202 {
    /*
	202
Question 2
Write a method named isEven that accepts an int argument. The method should return true if the argument is even,
 or false otherwise. Also write a program to test your method.
Show the answer.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer: ");
        num = console.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
