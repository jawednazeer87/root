package org.jn.core.java.student.shoaeeb.method;

public class Program19 {

	static double percent(int a,int b,int c,int d,int e)
	{
		double obtained=a+b+c+d+e;
		int total=500;
		double Percent = (obtained/total)*100;
		return Percent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(percent(70,50,60,55,77));
	}

}
