package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment125 {
    /*
  125
	void printStarFromRight(int n)
		print star pattern from right
     */
    public static void printStarFromRight(int row) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        printStarFromRight(3);
    }

}