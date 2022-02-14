package org.la.core.java.student.wang.assignment6;

public class Assignment334 {
    /*
	334
	42. wap to print single if number is single digit
*/

    static void singleOrNum(int num) {
        if (num>=-9 && num<=9) {
            System.out.println("single");
        } else {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        singleOrNum(4);
        singleOrNum(100);
    }
}
