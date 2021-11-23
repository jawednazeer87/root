package org.la.core.java.student.datatype.assignment2.waleed;

public class ArithmeticOp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 34;
        double d = 20.5;
        d+=a;              // means d = d + a // d = 54.5
        a+=d;              // a = a +d   //a= 88
        d-=a;              // d = d - a // d = -33.5
        a-=d;               // a =  a-d  a = 88 - -33.5 = 88+33.5 = 121.5 = 121 because a  is integer
        System.out.println(" d = " + ++d ); // high priority increment +1, d= -33.5 + 1 =-32.5 
        System.out.println(" a = " + a-- ); //low priority not change a =121
        System.out.println(" a = " + a ); // after doing the assignment decrease -1, a = 121-1 =120
	}

}
