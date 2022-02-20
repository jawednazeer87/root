package org.la.core.java.student.arfaz.operators_assign;

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
