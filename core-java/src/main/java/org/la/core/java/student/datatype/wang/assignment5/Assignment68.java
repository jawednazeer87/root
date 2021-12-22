
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment68 {
    /*
68	42. wap to print single if number is single digit
    */
    public static void main(String[] args) {
        int num = 1, temp =num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count==1){
            System.out.println(num+" is sigle digit.");
        }
    }
}