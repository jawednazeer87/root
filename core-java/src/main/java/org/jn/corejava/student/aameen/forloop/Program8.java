package org.jn.corejava.student.aameen.forloop;

public class Program8 {

	public static void main(String[] args) {
		// wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		System.out.println(" numbers which is completely divisible by 3 and 2 between 1 to 10.");
		System.out.println("----------------");
		for(int i = 1;i<10;i++) {
			if(i%2==0)
				System.out.println(i);
			else if(i%3==0)
				System.out.println(i);
				
		
		}
	}

}