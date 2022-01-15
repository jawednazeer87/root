package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print all upper case alphabets except vowels
 */

public class Program58 
{

	public static void main(String[] args) 
	{
		
		

		for(char i = 'A' ; i <= 'Z'  ;i++)
		{
			if(i == 'A'||i =='E'||i =='I'||i =='O'||i =='U')
			{
				System.out.print("_");
				continue;
			}
			System.out.print(i +" ");
		}
	}	
	
}
