package org.la.core.java.student.arfaz.ifstmt;

public class TwenteePro {

	public static void main(String[] args) {
		float fl = 5.3f;
		System.out.println(fl);
//		
		if (fl == 5.3f)
//			if (fl == 5.3) here mismatch becoz 5.3 as double and internal conversion when comparing 2 valuse
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
	}

}
