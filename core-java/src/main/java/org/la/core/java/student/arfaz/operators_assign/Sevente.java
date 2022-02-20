package org.la.core.java.student.arfaz.operators_assign;

public class Sevente {

	public static void main(String[] args) {
		int a = 31, b = 40;
		System.out.println(a+" "+b);

        int c = b - a;
        System.out.println(c);
        b = c % a;        
        System.out.println("c mod a ="+b);
        b = b / a;        
        System.out.println("b= "+b);
        a = ++c;        
        System.out.println("a= "+a);
        b = (a - --b) * c;
System.out.println(a+"  "+b);
	}

}
