package org.la.core.java.student.hasan.assignment04;

public class Loop74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		for(int i=1;i<=n;i++)
	      {
	       int num2=i;
	       int num1=i;
	       int sum=0;
	       int fact=1;
	      while(num1!=0)
	      {   fact=1;
	          int rem=num1%10;
	          num1=num1/10;
	          for(int j=1;j<=rem;j++)
	           fact=fact*j;
	          sum=sum+fact;
	      }
	      if(sum==num2)
	       System.out.println(i+" ");
	      }
	}

}
