package org.la.core.java.student.operators_assign.arfaz;

public class TwentyOn {

	public static void main(String[] args) {
		int a = 34;
        double d = 20.5;
        d+=a;
        System.out.println(" d = " + ++d );
        a+=d;
        d-=a;
        a-=d;
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        }

}
