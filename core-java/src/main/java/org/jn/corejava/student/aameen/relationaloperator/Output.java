package org.jn.corejava.student.aameen.relationaloperator;

public class Output {

	public static void main(String[] args) {
		// output 
		int a = 10;
        int b = a - 5;
        System.out.println("a <= b : "+(a <= b));
        System.out.println("a > b : "+ (a > b));
        
        System.out.println(" ");
        
        int c = 10;
        int d = 15;
        c++;
        d--;
        int e = d % c;
        System.out.println("e >= d : " +(e >= d));
        
        System.out.println(" ");
        int f = 10;
		boolean x = a++==10;
		boolean y = --a==10;
		System.out.println("f : "+f);
		System.out.println ("x : "+x);
		System.out.println ("y : " +y);
		

	}

}
