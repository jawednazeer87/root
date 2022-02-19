package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.ChildOdd;


/**
 * @author Waleed Rizq
 *
 * @date Feb 13, 2022
 */
public class OddMain {

	public static void main(String[] args) {
		
		int a [] = {44, 11 , 99, 50, 75 ,88,60,177,22,77};
	  ChildOdd parentodd= new ChildOdd();
	
	   int odd= parentodd.addOddEelements(a);
		
	

				System.out.println("Odd = "+ odd);

	}

}
