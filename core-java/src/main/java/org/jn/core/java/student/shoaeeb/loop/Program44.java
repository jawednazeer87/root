package org.jn.core.java.student.shoaeeb.loop;

import java.lang.Math;
public class Program44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean flag=false;
		for(int i=2; i<=Math.sqrt(7); i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("is not prime");
	}

}
