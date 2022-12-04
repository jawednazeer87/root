package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class CreateNPrintArrayUsingLoop {

	public static void main(String[] args) {
		int array[] = new int[100];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		for(int x:array) {
			System.out.println(x);
		}
	}

}
