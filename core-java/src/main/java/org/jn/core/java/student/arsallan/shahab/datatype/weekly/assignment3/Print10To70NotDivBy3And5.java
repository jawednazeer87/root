package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class Print10To70NotDivBy3And5 {

	public static void main(String[] args) {
		int i=10;
		while(i<=70) {
			if(i%3 !=0 && i%5 !=0) {
				System.out.println(i);
			};
			i++;
		}
	}

}