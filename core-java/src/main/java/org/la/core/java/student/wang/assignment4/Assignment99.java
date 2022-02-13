package org.la.core.java.student.wang.assignment4;

public class Assignment99 {

    /*
99-21.	int a = 34;
        double d = 20.5;
        d+=a;
        a+=d;
        d-=a;
        a-=d;
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
     */
    public static void main(String[] args) {
        int a = 34;
        double d = 20.5;
        d+=a; //54.5
        a+=d;//88
        d-=a;//54.5-88=-33.5
        a-=d;//88-(-33.5)=121
        System.out.println(" d = " + ++d );//-32.5
        System.out.println(" a = " + a-- );//121
    }
}