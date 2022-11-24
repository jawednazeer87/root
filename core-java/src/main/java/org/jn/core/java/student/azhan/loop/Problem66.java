package org.jn.core.java.student.azhan.loop;

public class Problem66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 19,f=0;
		for(int i=2; i<=(num/2); i++)
		{
			if(num%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==0 && num!=1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
