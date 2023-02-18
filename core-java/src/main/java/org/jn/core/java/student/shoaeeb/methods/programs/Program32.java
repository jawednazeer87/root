package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program32 {
	//reverse array
	static char [] reverse(char arr[])
	{
		char[] newArr  =  new char[arr.length];
		
		int index=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			newArr[index++]=arr[i];
		}
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'A','B','C'};
		char newArr[]  = Program32.reverse(arr);
		for(char c: newArr)
		{
			System.out.println(c);
		}
				
	}

}
