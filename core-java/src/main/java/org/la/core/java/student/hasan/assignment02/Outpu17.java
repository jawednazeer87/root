package org.la.core.java.student.hasan.assignment02;

public class Outpu17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31, b = 40;
        int c = b - a;
        System.out.println("a="+a+",b="+b+",c=b-a="+c);
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println("a="+a+", b="+b+", c="+c);
	}

}
