package org.jn.core.java.student.shoaeeb.absclss;

public class ArrayOperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation ar = new ArrayOperationImpl();
		int a[] = {1,5,6,4,-1,-6,-6};
		int b[] = {5,1,2,6,-2,-6,9};
		int c[]=ar.copy(a);
		//ar.print(c);
		int d[]=ar.copyArray(a, b);
		ar.print(d);
	}

}
