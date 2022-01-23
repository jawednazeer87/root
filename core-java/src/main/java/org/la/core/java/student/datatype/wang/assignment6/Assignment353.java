package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment353 {
    public static void main(String[] args) {
        int a = 12 + 21 * 3 - 9 / 2; //a =72
        int b = 14 - 32 * 4 + 175 / 8 - 3; //b =-97
        if(++a > 71 && --b < 20)
        {
            System.out.println("a = " + a + " b = " + b);//a:72, b=-97
        }
        if(b-- == -97 || a-- < 100)
        {
            System.out.println("a = " + a + " b = " + b); //a:72, b:-98
        }
    }
}
