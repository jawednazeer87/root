package org.la.corejava.student.aameen.forloop;

public class Program78 {

	public static void main(String[] args) {
		// pattern printing upside down 
		int num =5;
		
		for(int i =1;i<=num;i++)
		{
			for(int spc=1;spc<=i;spc++) {
				System.out.print(" ");
			}
			for(int str=1;str<=num-i+1;str++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
