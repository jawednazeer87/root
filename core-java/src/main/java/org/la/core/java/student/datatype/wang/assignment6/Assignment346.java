package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment346 {
    /*
	346
	54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
*/

    static void ageCategory(int age) {
        if (age < 13) {
            System.out.println("kid");
        } else if (age < 18 && age > 12) {
            System.out.println("teenage");
        } else {
            System.out.println("adult");
        }

    }

    public static void main(String[] args) {
        ageCategory(11);
        ageCategory(88);
    }
}
