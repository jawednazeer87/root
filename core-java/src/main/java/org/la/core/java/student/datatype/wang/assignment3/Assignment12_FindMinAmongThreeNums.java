package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment12_FindMinAmongThreeNums {
    //12.	wap to find smallest number among 3 numbers
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int min = (a < b) ? a < c ? a : c : b < c ? b : c;
        System.out.println("smallest number is " + min);
    }
}
