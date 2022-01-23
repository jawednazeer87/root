package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment345 {
    /*
	345
	53. wap to check whether a given number is positive and double digit or single digit number
*/

    static void digitsNum(int num) {
        int digits = digits(num);
        if (num >0){
            if (digits==2){
                System.out.println(num +" is positive double digits");
            }else if (digits==1){
                System.out.println(num +" is positive single digits");
            }
        }else {
            if (digits==2){
                System.out.println(num +" is negative double digits");
            }else if (digits==1){
                System.out.println(num +" is negative single digits");
            }
        }
    }
    static int digits(int num){
        int num1 = Math.abs(num);
        int length = 0;
        long temp = 1;
        while (temp <= num1) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static void main(String[] args) {
        digitsNum(11);
        digitsNum(-9);
    }
}
