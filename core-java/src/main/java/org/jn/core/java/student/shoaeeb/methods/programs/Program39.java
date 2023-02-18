package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program39 {
	//string to double array
	static double[] stringtoDoubleArray(String s)
	{
		
		double arr[]  = new double[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			arr[i]=s.charAt(i)-'0';
		}
		
		return arr; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "20.769";
		//double arr[]=
		double arr[]=Program39.stringtoDoubleArray(s);
		for(double d: arr)
		{
			System.out.println(d);
		}
		
	}

}
