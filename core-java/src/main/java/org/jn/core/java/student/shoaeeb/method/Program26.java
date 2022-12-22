package org.jn.core.java.student.shoaeeb.method;

public class Program26 {

	static char []reverseArray(char ch[])
	{
		char reverse[] = new char[ch.length];
		int j=0;
		for(int i=ch.length-1; i>=0; i--)
		{
			reverse[j]=ch[i];
			j++;
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[] = {'a','d','i','f'};
		char reverse[] = reverseArray(ch);
		
		for(int i=0; i<reverse.length; i++)
		{
			System.out.print(reverse[i]+ " ");
		}
	}

}
