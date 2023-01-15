package org.jn.core.java.student.shoaeeb.practiceset;

public class Program8 {
	//check string palindrome or not
	public static boolean palindrome(String str)
	{
		boolean check=true;
		
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				check=false;
				return check;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(palindrome("maam"))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
