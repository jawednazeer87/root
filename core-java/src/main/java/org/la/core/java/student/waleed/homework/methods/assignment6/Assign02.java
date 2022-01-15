package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign02 {

	public static void main(String[] args) {
		
		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		printPositive( a );
		
	}
	
	
	 static void printPositive(int a []) {
		 int index =0;
		for(int i :a) {
			
			if(i >=0) {
				System.out.println("a ["+index+"] = "+i);
				index++;
	}

}
	 }
	 
	 
	 
}
