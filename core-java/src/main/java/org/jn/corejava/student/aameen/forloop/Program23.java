package org.jn.corejava.student.aameen.forloop;

public class Program23 {

	public static void main(String[] args) {
		//wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		
		for(int i=10;i<=90;i++)
		{
			if(i%2!=0)
				System.out.println("2 : "+i);
			else if(i%5!=0)
				System.out.println("5 : "+i);
		}
	}

}
