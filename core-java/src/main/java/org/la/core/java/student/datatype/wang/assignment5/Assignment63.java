
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment63 {
    /*
  63	38.	wap to print all numbers from 1 to 10 except 2 and 5 and 8.
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==2||i==5||i==8){
                continue;
            }
            System.out.print(i+" ");
        }
        
    }
}
