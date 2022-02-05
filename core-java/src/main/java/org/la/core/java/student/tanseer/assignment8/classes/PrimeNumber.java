package org.la.core.java.student.tanseer.assignment8.classes;

public class PrimeNumber 
{
	private int num;
	
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public boolean primeNumber()
	{
		boolean flag = true;
		for(int i = 2; i <= num/2 ; i++)
		{
			if(num % i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

}
