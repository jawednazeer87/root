package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * create new array and copy the src array to new array in reverse order 
	char[] reverse(char[] src)
		reverse the same array and return.

 */
public class Program33ReverseArray 
{

	public static void main(String[] args) 
	{
		char[] res = {'s','m','a','r','t'};
		char[] r = reverse(res);
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(r));
		
	}
	
	static char[] reverse(char[] a)
	{
		char[] result = new char[a.length];
		int j = 0;
		for(int i = a.length - 1; i >= 0 ;i--)
		{
			result[j] = a[i];
			j++;
		}
		return result;
	}
}

