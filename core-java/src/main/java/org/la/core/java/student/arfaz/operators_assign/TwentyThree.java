package org.la.core.java.student.arfaz.operators_assign;

public class TwentyThree {

	public static void main(String[] args) {
		int a = 4;
        a -= 10;
        System.out.println(" a = " + a );

        a = -a;
        System.out.println(" a = " + a );

        a = 7 + a;

        System.out.println(" a = " + a );
        a %= a;
        a = a * a - 3 ;
        System.out.println(" a = " + a );
        }

}
