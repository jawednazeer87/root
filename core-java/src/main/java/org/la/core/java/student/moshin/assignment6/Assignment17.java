package org.la.core.java.student.moshin.assignment6;

public class Assignment17 {
	
public static void main(String[] args) {
				
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
