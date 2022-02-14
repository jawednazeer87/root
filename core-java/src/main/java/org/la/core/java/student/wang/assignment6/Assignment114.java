package org.la.core.java.student.wang.assignment6;

public class Assignment114 {
    /*
   114
	int add(int, int) - add two numbers and return sum
     */
    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Assignment114 assignment114 = new Assignment114();

        int num1 = 1, num2 = 2;
        int sum = assignment114.add(num1, num2);
        System.out.println("sum = " + sum);
    }
}
