package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class Print1To1500DivBy11And13 {

	public static void main(String[] args) {
		int i=0;
		while(i<1500) {
			if(i%11 == 0 && i%13 ==0 ) {
				System.out.println(i);
			}
			i++;
		}
	}

}
