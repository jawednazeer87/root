package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program40 {
	//string to int array
	static int[] stringToIntArray(String s)
	{
		int[] newArr  =  new int[s.length()];
		
		for(int i=0; i<s.length(); i++)
		{
			newArr[i]=s.charAt(i)-'0';
		}
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		int newArr[]=Program40.stringToIntArray(s);
		for(int n:newArr)
		{
			System.out.println(n);
		}
		
	}

}
