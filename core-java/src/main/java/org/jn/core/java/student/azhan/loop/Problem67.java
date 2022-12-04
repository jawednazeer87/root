package org.jn.core.java.student.azhan.loop;

public class Problem67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f, n=100;
		for(int i=1; i<=n; i++)
		{
			f=0;
			for(int j=2; j<=(i/2); j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0 && i!=1)
				System.out.println(i);
		}
	}

}
