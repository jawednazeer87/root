package org.la.core.java.student.operators_assign.arfaz;

public class Fiftee {

	public static void main(String[] args) {
		int i = (int) 34.0;
//		int i = 34.0; error bcoz double won't give as int var which has low priority
        int j = 7;
        int k = i % j;
        System.out.println("k = " + k );
	}

}
