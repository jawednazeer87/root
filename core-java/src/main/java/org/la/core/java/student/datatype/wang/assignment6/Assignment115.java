package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment115 {
    /*
   115
	int sub(int, int) - subtract two numbers and return result
     */
    public int sub(int num1, int num2) {
        return num1 - num2;

    }

    public static void main(String[] args) {
        Assignment115 assignment115 = new Assignment115();

        int num1 = 2, num2 = 1;
        int sub = assignment115.sub(num1, num2);
        System.out.println("sub = " + sub);
    }
}
