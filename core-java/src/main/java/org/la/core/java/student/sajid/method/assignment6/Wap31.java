package org.la.core.java.student.sajid.method.assignment6;

public class Wap31 {

	public static void main(String[] args) {
		// 31)	int checkChar(char c) 
		//return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
		
		char c = 'z';
		
		int i = checkChar(c);
		System.out.println(i);

	}
	
	static int checkChar(char c) {
		int ascii = (char) c;
		int i=0;
		
		if(ascii>=65 && ascii<=97) {
			i = 1;
		}else if (ascii >=98 && ascii<=122) {
			i = -1;
		}else {
			i = 0;
		}
	
		return i;
	}

}
