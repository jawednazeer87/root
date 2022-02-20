package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		Create a parent class having int[] copy(int[]) method, override this method in child class 
		copy method will copy provided array to new array and will return new array.*/
public class PareSub15 extends Pare15 {
	   int[] copy(int[]a){
			int b[] = new int[15];
			for(int i=0;i<a.length;i++)
				b[i]=a[i];
				
			   return b;	
				  	
			}
}
