package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program52 {
	static String arrayToString(int a[])
	{
		String s="";
		for(int i=0; i<a.length; i++)
		{
			s+=a[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		String s = Program52.arrayToString(a);
		System.out.println(s);
	}

}
