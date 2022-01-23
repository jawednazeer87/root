package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment325 {
    /*
	325
	34.	wap to print all lower case alphabets except vowels.
*/

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
