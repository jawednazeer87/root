package org.la.corejava.student.aameen.forloop;

public class Program24 {

	public static void main(String[] args) {
		// wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
		for(int i = 100;i>=1;i--)
		{
			if(i%11!=0)
				System.out.println(i);
			else if(i%3!=0)
				System.out.println(i);
		}

	}

}
