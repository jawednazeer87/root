package org.jn.core.java.student.azhan.loop;

public class Problem72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000,sum;
		for(int j=1; j<=n; j++)
		{
			sum = 0;
			for(int i=1; i<=(j/2); i++)
			{
				if(j%i==0)
					sum = sum + i;
			}
			if(sum == j)
				System.out.println(j);
		}
	}

}
