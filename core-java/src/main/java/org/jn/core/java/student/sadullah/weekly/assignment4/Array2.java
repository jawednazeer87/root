package org.jn.core.java.student.sadullah.weekly.assignment4;

public class Array2 {

	public static void main(String[] args) {
		int loop [] = new int [50];
		
		for (int i = 0; i < loop.length; i++) {
			loop[i] = i+1;
		}
		for (int i = 0; i < loop.length; i++) {
			System.out.println("loop [" +i +"] = " + loop[i]);
		}
	}
}
