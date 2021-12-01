package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment20 {
    public static void main(String[] args) {
        int a = 12 + 21 * 3 - 9 / 2; //71
        int b = 14 - 32 * 4 + 175 / 8 - 3;//-96
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if(++a > 71 && --b < 20) //72>71 &&-97<20
        {
            System.out.println("a = " + a + " b = " + b); //a=72, b=-97
        }
        if(b-- == -97 || a-- < 100) //-97 ==-97 true ||
        {
            System.out.println("a = " + a + " b = " + b);//b=-98 a=72
        }

    }
}
