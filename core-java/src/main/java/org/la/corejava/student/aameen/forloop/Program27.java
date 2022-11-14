package org.la.corejava.student.aameen.forloop;

public class Program27 {

	public static void main(String[] args) {
		// wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.
		
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			break;
			System.out.println("i : "+i);
				
		}
		System.out.println("loop break when it reach i = 7 ");
	}

}
