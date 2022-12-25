package org.jn.core.java.student.loop;

public class Program43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int n=9;
		int f[]=new int[n+2];
		
		f[0]=0;
		f[1]=1;
		
		for(int i=2; i<=n; i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		
		System.out.println(f[n]);
	}

}
