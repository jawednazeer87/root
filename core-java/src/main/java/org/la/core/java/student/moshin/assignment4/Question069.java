package org.la.core.java.student.moshin.assignment4;

public class Question069 
{
	//69.	Wap to check whether a number is Armstrong number or not.
    //how to do n digits
//153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153//check 3 digits
    public static void main(String[] args) {

        int num = 153, sum = 0, temp = num, digits=0;
        System.out.println("num = " + num);
        while (temp>0){
            temp = temp /10;
            digits++;
        }
        System.out.println("digits = " + digits);
        temp = num;
        while (temp > 0) {
            int remainder = temp % 10;//r=3;
            sum += Math.pow(remainder, digits);
            temp = temp / 10; //result =15;
        }
        System.out.println("sum = " + sum);
        if (num == sum) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }
     }
}

