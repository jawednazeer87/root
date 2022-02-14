package org.la.core.java.student.wang.assignment6;

public class Assignment127 {
    /*
  127
	void printStarReverseRight(int n)
		print star in decreasing order from right
     */
    public static void printStarReverse(int row) {

        for (int i = row; i > 0; i--) {

            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printStarReverse(3);
    }

}