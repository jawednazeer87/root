package org.la.core.java.student.waleed.operators.ternary;

public class GreatestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 2001, b=5007 , c= 11000;
    int greatest = a>b ? a>c? a:c   : b>c? b:c;
    System.out.println("Greates ="+greatest);
	}

}
