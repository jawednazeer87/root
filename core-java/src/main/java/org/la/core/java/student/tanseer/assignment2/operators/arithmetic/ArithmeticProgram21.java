package org.la.core.java.student.tanseer.assignment2.operators.arithmetic;

public class ArithmeticProgram21 {

	public static void main(String[] args) 
	{
		int a = 34;
        double d = 20.5;
        d+=a;
        System.out.println("a :" + a);
        a+=d;
        System.out.println("d :" + d);
        d-=a;
        System.out.println("a :" + a);
        a-=d;
        System.out.println("d :" + d);
        
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );

	} 

}
