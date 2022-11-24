package org.jn.core.java.student.azhan.loop;

public class Problem71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 28,sum=0;
		for(int i=1; i<=(num/2); i++)
		{
			if(num%i==0)
				sum = sum + i;
		}
		if(sum == num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}

}
