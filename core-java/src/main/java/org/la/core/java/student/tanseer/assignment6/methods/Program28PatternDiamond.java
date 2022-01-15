package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void diamond(int n)
	print diamond

 */
public class Program28PatternDiamond 
{

	public static void main(String[] args) 
	{
		diamond(4);
	}
	
	static void diamond(int n)
	{
		for(int i = -n; i <= n; i++)
		{
			int j = i;
			if(j < 0)
			{
				j = -j;
			}
			for(int k=1 ; k<=j ; k++) {
				System.out.print(" ");
			}
			//printing star
			for(int k=0 ; k<=n-j ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

