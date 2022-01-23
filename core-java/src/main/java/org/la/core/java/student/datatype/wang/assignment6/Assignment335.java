package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment335 {
    /*
	335
	43. wap to print ternary if number is 3 digit
*/

    static void ternaryOrNum(int num) {
        int length = digits(num);
        if (length==3){
            System.out.println("ternary");
        }else {
            System.out.println(num);
        }
    }
    static int digits(int num){
        int length = 0;
        long temp = 1;
        while (temp <= num) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static void main(String[] args) {
        ternaryOrNum(4);
        ternaryOrNum(11);
        ternaryOrNum(111);
    }
}
