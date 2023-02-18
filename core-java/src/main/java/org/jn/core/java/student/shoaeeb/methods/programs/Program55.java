package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program55 {
	static String arrayToString(float arr[])
	{
		String s="";
		for(int i=0; i<arr.length; i++)
		{
			s+=arr[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[] = {1f,2f,3f,4f};
		String s = Program55.arrayToString(arr);
		System.out.println(s);
	}

}
