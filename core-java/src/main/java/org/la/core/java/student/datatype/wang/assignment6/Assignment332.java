package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment332 {
    /*
	332
	40. wap to print hi if number is zero and by if number is 100
*/

    static void hiOrByOrNum(int num) {
        if (num == 0) {
            System.out.println("hi");
        } else if (num == 100) {
            System.out.println("by");
        } else {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        hiOrByOrNum(99);
        hiOrByOrNum(0);
        hiOrByOrNum(100);
    }
}
