package org.la.core.java.student.moshin.assignment8;

public class PatternDesign {
	
    /*
    33.	create a class having name Pattern, then add methods to print all patterns like increaseStar, decreaseStar, increaseStartFromRight, decreaseStartFromRight, diamond, pyramid, reversePyramid.
	All these methods will accept one int argument and will not return anything.
     */
    public static void increaseStar(int n){
        int i, j, row = n;
        for ( i = 0; i <= row; i++) {
            for ( j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void decreaseStar(int n){
        int i, j, row = n;
        for ( i = row; i >= 1; i--) {
            for ( j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void increaseStartFromRight(int n){
        int i,j,row = n;
        for ( i = 1; i <= row; i++) {
            for (j = row; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void decreaseStartFromRight(int n){
        int i,j,row = n;
        for ( i = row; i >= 1; i--) {
            for ( j = row; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void diamond(int n){
        int i,j,row = n;
        // Outer loop 1
        // prints the first half diamond
        for (i = 1; i <= row; i++) {

            // Inner loop 1 print whitespaces inbetween
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (i = row - 1; i > 0; i--) {

            // Inner loop 1 print whitespaces inbetween
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ ) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public static void reversePyramid(int n){
        int rows = n; // Number of Rows we want to print
        //Printing the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =7;
        increaseStar(n);
        System.out.println();
        increaseStartFromRight(n);
        System.out.println();
        decreaseStar(n);
        System.out.println();
        decreaseStartFromRight(n);
        System.out.println();
        diamond(n);
        System.out.println();
        pyramid(n);
        System.out.println();
        reversePyramid(n);
    }
}
