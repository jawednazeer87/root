package org.la.core.java.student.arfaz.forpattern;


public class SixtyFourPro {
	public static void main(String[] args) {
		char smal,caps;
		for(int n='a',m='A';n<='z'&& m<='Z';n++,m++) {
			smal = (char) n;
			caps = (char)m;
			System.out.println(smal+"="+n+"\n");
			
			System.out.println(caps+"="+m+"\n");
			caps++;
		}
		  char b;
		   for(int a='0';a<='9';a++)
		   {
		       b=(char)a;
		       System.out.println(b+"="+a);
		       b++;//for printing numbers as characters
		   }

	}
}
