package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class Print10To50DivBy2And5 {
	public static void main(String[] args) {
		int i=10;
		while(i<=50) {
			if(i%2==0 && i%5==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
