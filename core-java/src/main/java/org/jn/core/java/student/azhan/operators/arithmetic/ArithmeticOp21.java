package org.jn.core.java.student.azhan.operators.arithmetic;

public class ArithmeticOp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34;
        double d = 20.5;
        d+=a;
        a+=d;
        d-=a;
        a-=d;
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
	}

}
