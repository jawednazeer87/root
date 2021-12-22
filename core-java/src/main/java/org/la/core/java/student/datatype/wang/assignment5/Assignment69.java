
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment69 {
    /*
69	43. wap to print ternary if number is 3 digit
    */
    public static void main(String[] args) {
        int num = 100, temp =num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count==3){
            System.out.println("ternary");
        }
    }
}