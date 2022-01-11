package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print all lower case alphabets except vowels.
 */

public class Program59 
{

	public static void main(String[] args) 
	{
		
		

		for(char i = 'a' ; i <= 'z'  ;i++)
		{
			if(i == 'a'||i =='e'||i =='i'||i =='o'||i =='u')
			{
				System.out.print("_");
				continue;
			}
			System.out.print(i +" ");
		}
	}	
	
}
