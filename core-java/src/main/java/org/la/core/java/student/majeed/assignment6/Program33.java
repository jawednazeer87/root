package org.la.core.java.student.majeed.assignment6;

public class Program33 {

	public static void main(String[] args) {
		/*
		int checkChar(char c) 
		return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
		 */
		int res = 0;
		res = checkChar('a');
		System.out.println(res);
	}
	
	static int checkChar(char c) {
		int result=0;
	    	   if(c>=65 && c<=90) {
	    		   result =1;
	    	   }else if(c>=97 && c<=122) {
	    		   result =-1;
	    	   }else
	    		   result = 0;  

	       return result;
		}
}