package org.la.core.java.student.hasan.assignment04;

public class Loop66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=31, i=2;
boolean isprime=false;
while(i<=n/2) {
	if(n%i==0){
		isprime=true;
	}i++;
}if(isprime==false)
	System.out.println(n+" is a prime number");
else
	System.out.println(n+" is not a prime number");
	}

}
