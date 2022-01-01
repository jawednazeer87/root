package org.la.core.java.student.hasan.assignment04;

public class Loop42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=13;
boolean isprime=true;
for (int i=2;i<n/2;i++) {
	if(n%i==0) {
		isprime=false;
		break;
	}
}if(isprime==true)
	System.out.println(n+" is a prime number");
else 
	System.out.println(n+" is not a prime number");
	}

}
