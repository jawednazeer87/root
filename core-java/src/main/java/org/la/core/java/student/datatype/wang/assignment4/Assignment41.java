package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment41 {
    //41.	wap to print fibonocci series
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < 10) {
            //print the number
            System.out.print(num1 + " "); //0 1 1 2 3 5 8 13 21 34
            //swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter += 1;
        }
    }


}
