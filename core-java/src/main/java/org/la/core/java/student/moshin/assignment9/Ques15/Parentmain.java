package org.la.core.java.student.moshin.assignment9.Ques15;

public class Parentmain {
	public static void main(String[] args) {
		Parent pa = new child();
		int a[] = new int[10];
		for(int i=0;i<9;i++)
		a[i] = i;
		int d[]= pa.copy(a);
		for(int l:d)
			System.out.println(l);
	}
	
	
}
