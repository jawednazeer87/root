package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class PrintUpperCaseAlphabetsWIthOutVowels {

	public static void main(String[] args) {
		char alphabet = 65;
		while(alphabet <=90) {
			if(alphabet == 65 || alphabet ==69 || alphabet ==73 || alphabet == 79 || alphabet ==85 ) {
			 System.out.println("");
			}else {
				System.out.println(alphabet);
			}
			alphabet++;
		}
	}

}
