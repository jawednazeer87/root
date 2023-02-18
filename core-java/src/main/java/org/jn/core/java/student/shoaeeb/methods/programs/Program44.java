package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program44 {
	//convert int to char array
	static char[] intToCharArray(int[] arr)
	{
		char ch[] = new char[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			ch[i]=(char) (arr[i]+'0');
		}
		return ch;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
	    char ch[] = Program44.intToCharArray(arr);
	    for(char c: ch)
	    {
	    	System.out.println(c);
	    }
	}

}
