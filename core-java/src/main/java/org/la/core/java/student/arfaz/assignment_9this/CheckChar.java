package org.la.core.java.student.arfaz.assignment_9this;

public class CheckChar {
	private char c;
	
	public void seta(char c) {
		this.c=c;
	}
	public char geta() {
		return c;
	}
	
	
	
	 public int checkChar() {
			if(c>=65 && c<=91)          // A = 65 is ASCII table
				return 1;
			else if(c>=97&&c<=123)	//a=97 is ascii table
				return -1;
			
				return 0;
			
		}
}
