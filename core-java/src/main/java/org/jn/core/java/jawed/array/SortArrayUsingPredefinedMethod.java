package org.jn.core.java.jawed.array;

import java.util.Arrays;

/**
 * @author jawednazeer
 * Sort an array using predefined function
 */
public class SortArrayUsingPredefinedMethod {

	public static void main(String[] args) {
		int[] src = {-2, 3, 2, 5, 1, -1};
		Arrays.sort(src);		//predefined function which will sort our array
		print(src);
	}
	static void print(int[] a) {
		for(int i : a){
			System.out.println(i);
		}
	}
}
