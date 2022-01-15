package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign04 {

	public static void main(String[] args) {
		int a [] = {44, 11 , 99, 50, 75 ,88,60,177,22,77};
		printOdd(a);
	}
		static void printOdd(int a []) {
		for(int i=0 ; i<=a.length-1 ; i++) {
			if(a [i] %2==1) {
				System.out.println("a ["+i+"] ="+a [i]);
	           }

	}

	}

}
