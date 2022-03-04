package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		Create a parent class having int[] copy(int[]) method, override this method in child class 
		copy method will copy provided array to new array and will return new array.*/
public class Pare15Main {
	public static void main(String[] args) {
		Pare15 pa = new PareSub15();
		int a[] = new int[15];
		for(int i=0;i<8;i++)
		a[i] = i;
		int d[]= pa.copy(a);
		for(int l:d)
			System.out.println(l);
	}
	
	
}
