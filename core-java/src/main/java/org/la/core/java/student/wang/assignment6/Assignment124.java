package org.la.core.java.student.wang.assignment6;

public class Assignment124 {
    /*
  124
	void printIncrStar(int n)
		print star patter
     */
    public static void printIncrStar(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        printIncrStar(3);
    }

}