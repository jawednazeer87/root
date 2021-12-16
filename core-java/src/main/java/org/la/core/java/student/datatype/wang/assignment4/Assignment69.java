package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment69 {
    //69.	Wap to check whether a number is Armstrong number or not.
    //how to do n digits
//153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153//check 3 digits
    public static void main(String[] args) {

        int num = 153, sum = 0, temp = num;
        System.out.println("num = " + num);
        while (num > 0) {
            int remainder = num % 10;//r=3;
            sum += Math.pow(remainder, 3);
            num = num / 10; //result =15;
        }
        System.out.println("sum = " + sum);
        if (temp == sum) {
            System.out.println(temp + " is Armstrong number");
        } else {
            System.out.println(temp + " is not Armstrong number");
        }
    }
}