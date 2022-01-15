package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign06 {

	public static void main(String[] args) {
		
		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		int b[] = new int [a.length];
		copyOneToAnother(a, b);
	}
		
		static void copyOneToAnother(int a [], int b[]) {
			
			int index = 0;
		
			for(int i:a) {
				
		        b[index]= i;
			System.out.println("b ["+index+"] ="+b [index]);
			index++;
      }
	
	System.out.println("a [] ="+a);
	System.out.println("b [] ="+b );
			
	}

}
