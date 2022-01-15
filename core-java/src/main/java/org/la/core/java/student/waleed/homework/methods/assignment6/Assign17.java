package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =3334;
		int b= 33;
		int r= reminderNum(a,b);
		System.out.println(" Reminder = "+ r);
	}
	 
	
	static int reminderNum (int a, int b) {
		
		int r= a % b;
		return r;
		
	}

}
