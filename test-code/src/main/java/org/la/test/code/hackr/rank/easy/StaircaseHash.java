package org.la.test.code.hackr.rank.easy;

public class StaircaseHash {
    public static void staircase(int n) {
        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<=n-i ;s++){
                System.out.print(" ");
            }
            for(int h=1 ; h<=i ; h++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(5);
    }
}
