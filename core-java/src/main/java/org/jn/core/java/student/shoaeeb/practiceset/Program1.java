package org.jn.core.java.student.shoaeeb.practiceset;

public class Program1 {
	//reverse a string
	public static void main(String[] args) {
		// TODO	 Auto-generated method stub
		String st = "123";
		String rev=" ";
		char ch;
		for(int i=0; i<st.length(); i++)
		{
			ch=st.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	
		
	}

}
