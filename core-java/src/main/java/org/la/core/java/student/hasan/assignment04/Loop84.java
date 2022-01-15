package org.la.core.java.student.hasan.assignment04;

public class Loop84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=3;
        for ( i = 1; i <= row; i++) {
            for ( j = row-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
	}

}
