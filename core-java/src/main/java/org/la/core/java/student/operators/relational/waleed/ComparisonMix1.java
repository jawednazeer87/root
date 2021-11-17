package org.la.core.java.student.operators.relational.waleed;

public class ComparisonMix1 {

	public static void main(String[] args) {
		// x was false because n was 7 and (7!=8) then n added by 1, n= 8 after that z= (8 == 8)...so, z= true then after assigning the value of z , n added by 1 , n= 9
		// on the other hand, t = false because m = 9 and  t = (9 !=9) and that's not true ...
	int n = 7, m = 7;
		
		boolean x = n++ == ++m;
		boolean z= n++ == m;
		boolean t= n != ++m;
		System.out.println("n: "+n);
		System.out.println("m: "+m);
		System.out.println("x: "+x);
		System.out.println("z: "+z);
		System.out.println("t: "+t);
	
	}

	}


