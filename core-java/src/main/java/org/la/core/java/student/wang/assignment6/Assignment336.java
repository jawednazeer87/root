package org.la.core.java.student.wang.assignment6;

public class Assignment336 {
    /*
	336
	44. wap to print 100 if number is between 100 to 200
*/

    static void print100(int num) {
        if (num >= 100 && num <= 200) {
            System.out.println("100");
        } else {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        print100(4);
        print100(11);
        print100(111);
    }
}
