package org.la.core.java.student.hasan.assignment04;

public class Loop71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=28, sum=0;
for (int i=1;i<n;i++) {
	if(n%i==0) {
		sum=sum+i;
	}
}
if(sum==n)
	System.out.println(n+" is perfect number");
else
	System.out.println(n+" is not perfect number");
	}

}
