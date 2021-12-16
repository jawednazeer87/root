package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment31 {
    //31 wap to give a condition that loop may be rotate upto 10 but break loop when it rotates upto 7 times.

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i==7)
                break;
            System.out.println(i);
        }
    }
}
