package org.jn.core.java.student.azhan.loop;

public class Problem69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1,count=0;
		int n,N=0,i;
		n = num;
		if(num==0)
			count++;
		while(num != 0)
		{
			count++;
			num/=10;
		}
		
		num=n;
		while(num>0)
		{
			i = num%10;
			N = N + (int)Math.pow(i,count);
			num/=10;
		}
		if(N==n)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
