package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment135 {
    /*
	135	create a class name PatternPrinting
		create these methods
			void increasingStar(int)
			void decreasingStar(int)
			void increasingStarWithSpace(int)
			void decreasingStarWithSpace(int)
			void pyramid(int)
			void reversePyramid(int)
			void diamond(int)
			void numRow(int)
			void numColumn(int)
     */
    public static void increasingStar(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void decreasingStar(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void increasingStarWithSpace(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void decreasingStarWithSpace(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reversePyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= row - 1 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamond(int row) {
        int i, j, space = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        increasingStar(3);
        decreasingStar(3);
        increasingStarWithSpace(3);
        decreasingStarWithSpace(3);
        pyramid(3);
        reversePyramid(3);
        diamond(3);
    }
}