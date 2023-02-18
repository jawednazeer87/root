package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program18 {
	//find the average of three arguments
	static int average(int a,int b,int c)
	{
		int sum=0;
		sum=a+b+c;
		return sum/3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avg=Program18.average(11, 12, 13);
		System.out.println(avg);
	}

}
