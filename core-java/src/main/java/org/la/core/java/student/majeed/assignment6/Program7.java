package org.la.core.java.student.majeed.assignment6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program7 {
	static Logger log = LoggerFactory.getLogger(Program7.class);
	static int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		/*
		int[] copy(int[])
		create an array and copy supplied array and return that new array
		 */
				
		int[] arr2= new int[arr1.length];
		
		arr2 = copy(arr1);
		for(int i:arr2) {
			log.info(""+i);
			
		}
	}	
	
	static int[] copy(int[] a) {
		int[] arr3= new int[arr1.length];
		arr3 = a;
		return arr3;
	}
	
}