package org.la.core.java.student.wang.assignment3;

public class Assignment02 {
    //2.	wap to find which number is greater among three numbers
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int maxNumber = (a > b) ? a > c ? a : c : b > c ? b : c;
        System.out.println("maxNumber = " + maxNumber);
    }
}
