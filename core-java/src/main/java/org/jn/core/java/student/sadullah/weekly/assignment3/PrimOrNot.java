package org.jn.core.java.student.sadullah.weekly.assignment3;

public class PrimOrNot {

	public static void main(String[] args) {
		int n=2,c=0;
		for(int i=1;i<n;i++)
		{
		if(n%i==0)
		{
		c++;
		}
		}
		if(c==1)
		{
		System.out.println("Prime");
		}
		else
		{
		System.out.println("Not prime");
		}
	}
}
