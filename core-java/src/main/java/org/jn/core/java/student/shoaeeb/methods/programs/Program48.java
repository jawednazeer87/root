package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program48 {

	static double sumArray(double d[])
	{
		double sum=0;
		for(double ele: d)
		{
			sum+=ele;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = {1d,2d,3d};
		double sum=Program48.sumArray(arr);
		System.out.println(sum);
	}

}
