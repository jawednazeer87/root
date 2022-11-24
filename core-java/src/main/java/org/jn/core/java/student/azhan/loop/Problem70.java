package org.jn.core.java.student.azhan.loop;

public class Problem70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 200;
		for(int i=1; i<=n; i++)
		{
			int num = i,count=0;
			int n1,n2=0,j;
			n1 = num;
			if(num==0)
				count++;
			while(num != 0)
			{
				count++;
				num/=10;
			}
			
			num=n1;
			while(num>0)
			{
				j = num%10;
				n2 = n2 + (int)Math.pow(j,count);
				num/=10;
			}
			if(n2==n1)
				System.out.println(i);
		}
	}

}
