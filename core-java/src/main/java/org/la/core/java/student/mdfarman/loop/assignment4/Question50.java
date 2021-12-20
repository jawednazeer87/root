package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question50 {

//	  50.	Wap to print all odd number between 1 to 100.

	public static void main(String[] args) {
		int start = 1 , end = 100 ;
		while(start<=end) {
			if (start%2!=0)
				System.out.println(start);
			start++;
		}	

	}
}
