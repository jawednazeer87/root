package org.la.core.java.student.hasan.assignment04;

public class Loop67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
for (int i=2; i<=n;i++) {
	boolean isprime=false;
	for( int j=2;j<=i/2;j++) {
		if(i%j==0){
			isprime=true; break;
		}
	}
	if(isprime==false)
		System.out.println(i);
}
	}

}
