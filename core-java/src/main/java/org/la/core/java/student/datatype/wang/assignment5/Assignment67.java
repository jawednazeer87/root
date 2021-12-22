
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment67 {
    /*
 67	41. wap to print double if number is a double digit
    */
    public static void main(String[] args) {
        int num = 188, temp =num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count==2){
            System.out.println(num+" is double digit.");
        }
    }
}