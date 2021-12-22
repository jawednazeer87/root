
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment80 {
    /*
80	54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
    */
    public static void main(String[] args) {
        int age = 9;
        if (age<13){
            System.out.println("kid");
        }else if (age<18){
            System.out.println("teenager");
        }else {
            System.out.println("adult");
        }
    }
}