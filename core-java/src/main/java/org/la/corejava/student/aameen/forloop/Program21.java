package org.la.corejava.student.aameen.forloop;

public class Program21 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 70 those are not divisible by 3 and 5
		for(int i=10;i<=70;i++)
		{
			if(i%3!=0)
				System.out.println(i);
			else if(i%5!=0)
				System.out.println(i);
		}
	}

}
