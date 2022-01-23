package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment356 {
    public static void main(String[] args) {
        int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) { //x=25,y=21
            System.out.println(x + "," + y);
        }
    }
}
//x=25,y=21