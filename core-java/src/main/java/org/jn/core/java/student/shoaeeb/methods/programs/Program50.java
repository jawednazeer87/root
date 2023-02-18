package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program50 {
	
	
	static double sumArray(double d[])
	{
		double sum=0;
		for(int i=d.length/2; i<d.length; i++)
		{
			sum+=d[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = {1d,2d,3d,4d,5d,6d};
		double sum = sumArray(d);
		System.out.println(sum);
	}

}
