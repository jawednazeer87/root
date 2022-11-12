package org.jn.core.java.student.loop;


import java.lang.Math;
public class Program63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		boolean flag = false;
		for(int i=2; i<=Math.sqrt(7); i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Prime Number");
		}
	
	}

}
