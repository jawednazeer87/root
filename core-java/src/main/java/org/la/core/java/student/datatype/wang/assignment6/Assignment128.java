package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment128 {
    /*
  128
	void diamond(int n)
		print diamond
     */
    public static void diamond(int row) {

        int i, j, space;
        space = row - 1;
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

    public static void main(String args[]) {

        diamond(3);
    }

}