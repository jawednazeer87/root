package org.jn.core.java.student.shoaeeb.arithmeticoperation;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31, b = 40;
        int c = b - a;
        System.out.println(c);
        b = c % a;        
        System.out.println(b);
        b = b / a;        
        System.out.println(b);
        a = ++c;        
        System.out.println(a);
        b = (a - --b) * c;
        System.out.println(b);
	}

}
