
package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment62 {
    /*
  62	37.	wap to print all numbers from 1 to 10 except 3 and 7.
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==3||i==7){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
