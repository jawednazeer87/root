package org.jn.core.java.student.azhan.loop;

public class Problem53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
				sum = sum + i;
		}
		System.out.println(sum);
	}

}
