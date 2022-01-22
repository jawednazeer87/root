package org.la.core.java.student.moshin.assignment6;

public class Assignment03 {

	public static void main(String[] args) {
		int a [] = {44, 11 , 99, 50, 75 ,88,60,177};
		printEven(a);
	}
		static void printEven(int a []) {
		for(int i=0 ; i<=a.length-1 ; i++) {
			if(a [i] %2==0) {
				System.out.println("a ["+i+"] ="+a [i]);
	           }

	}

}
}