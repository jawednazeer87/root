package org.la.core.java.student.wang.assignment6;

public class Assignment126 {
    /*
  126
	void printStarReverse(int n)
		print star pattern in decrease order
     */
    public static void printStarReverse(int row) {

        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        printStarReverse(3);
    }

}