package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program33 {
	static char[] reverse(char c[])
	{
		for(int i=0; i<c.length/2; i++)
		{
			char temp = c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'A','B','C'};
		c= Program33.reverse(c);
		for(char ch: c)
		{
			System.out.println(ch);
		}
		
	}

}
