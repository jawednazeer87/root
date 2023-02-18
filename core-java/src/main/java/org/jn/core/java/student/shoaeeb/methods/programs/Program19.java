package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program19 {
	//find the percentage and return result
	static double percent(int a,int b,int c,int d,int e)
	{
		int sum=a+b+c+d+e;
		double res  = (double)sum/500;
		return res*100;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=56,b=40,c=70,d=50,e=55;
		double res=Program19.percent(a, b, c, d, e);
		System.out.println(res);
	}

}
