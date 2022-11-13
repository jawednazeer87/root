package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintUpperAlphasExceptVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(char ch='A';ch<='Z';ch++) {
        	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
        		continue;
        	} else {
        		System.out.println(ch);
        	}
        }
	}

}
