package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class PrintLowerCaseVowels {

	public static void main(String[] args) {
		char alphabet = 97;
		while(alphabet <= 122) {
			if(alphabet == 97 || alphabet == 101 || alphabet == 105 || alphabet == 111 || alphabet == 117 ) {
				System.out.println(alphabet);
			}
			alphabet++;
		}
	}

}
