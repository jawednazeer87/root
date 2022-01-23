package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment326 {
    /*
	326
	35.	wap to print all lower case vowels.
*/

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                System.out.print(i + " ");
            }
        }
    }
}
