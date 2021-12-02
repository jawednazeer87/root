package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment08 {
    //8.	wap to find division secured by a student
    public static void main(String[] args) {
        int score = 88;
        if (100 >= score && score > 80) {
            System.out.println("A level");
        } else if (score > 70) {
            System.out.println("B level");
        } else if (score > 60) {
            System.out.println("C level");
        } else {
            System.out.println("F level");
        }
    }
}
