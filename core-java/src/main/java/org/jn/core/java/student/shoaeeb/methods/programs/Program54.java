package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program54 {
	
	static String arrayToString(double d[])
	{
		String s="";
		for(int i=0; i<d.length; i++)
		{
			s+=d[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = {1d,2d,3d,4d};
		String s=Program54.arrayToString(d);
		System.out.println(s);
	}

}
