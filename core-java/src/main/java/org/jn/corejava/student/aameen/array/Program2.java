package org.jn.corejava.student.aameen.array;

public class Program2 {

	public static void main(String[] args) {
		// dynamic array 
		int a[] = new int[3];
		
		for(int i = 0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a{"+i+"} = "+a[i]);
		}

	}

}
