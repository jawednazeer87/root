package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class Print100To1NotDivBy11And3 {

	public static void main(String[] args) {
		int i=100;
		while(i>=1) {
			if(i%11 !=0 && i%3 !=0) {
				System.out.println(i);
			}
			i--;
		}
	}

}
