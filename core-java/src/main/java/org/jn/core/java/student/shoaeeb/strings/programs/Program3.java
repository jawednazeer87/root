package org.jn.core.java.student.shoaeeb.strings.programs;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is a String ";
		String s[];
		s=s1.split(" ");
		for(int i=s.length-1; i>=0; i--)
		{
			System.out.print(s[i]+" ");
		}
	}

}
