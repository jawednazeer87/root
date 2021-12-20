package org.la.core.java.student.majeed.assignment4;

public class Program31 {

	public static void main(String[] args) {
		// 31.	wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			if(i==7)
				break;
			i++;
		}
	}

}
