package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment10 {
    //    10.	A school has following rules for grading system:
//    a. Below 25 - F
//    b. 25 to 45 - E
//    c. 45 to 50 - D
//    d. 50 to 60 - C
//    e. 60 to 80 - B
//    f. Above 80 - A
//    provide marks and print the corresponding grade.
    public static void main(String[] args) {
        int score = 88;
        if (100 >= score && score >= 80) {
            System.out.println("A level");
        } else if (score >= 60) {
            System.out.println("B level");
        } else if (score > 50 && score < 60) {
            System.out.println("C level");
        } else if (score < 50 && score >= 45) {
            System.out.println("D level");
        } else if (score < 45 && score >= 25) {
            System.out.println("E level");
        } else if (score < 25) {
            System.out.println("F level");
        }
    }
}
