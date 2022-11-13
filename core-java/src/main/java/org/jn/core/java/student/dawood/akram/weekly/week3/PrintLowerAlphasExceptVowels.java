package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintLowerAlphasExceptVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(char ch='a';ch<='z';ch++) {
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		continue;
        	} else {
        		System.out.println(ch);
        	}
        }
	}

}
