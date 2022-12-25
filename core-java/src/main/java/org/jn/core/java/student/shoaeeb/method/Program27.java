package org.jn.core.java.student.shoaeeb.method;

public class Program27 {

	static char [] reverseArray(char ch[])
	{
		int size=ch.length;
		for(int i=0; i<ch.length/2; i++)
		{
			char temp=ch[i];
			ch[i]=ch[size-1-i];
			ch[size-1-i]=temp;
		}
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[] = {'a','d','i','f'};
		reverseArray(ch);
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]+ " ");
		}
	}

}
