package org.la.core.java.student.majeed.assignment4;

public class Program74 {

	public static void main(String[] args) {
		// 74.	Wap to print all Strong numbers between 1 to n.
		
		for(int seq=1;seq<=1000;seq++) {
		  int num = seq;
		      int num2=num, sum=0, fact=1;
		     while(num!=0)
		     {   fact=1;
		         int rem=num%10;
		         num=num/10;
		         for(int i=1;i<=rem;i++)
		          fact=fact*i;
		         sum=sum+fact;
		     }
		     if(sum==num2)
		      System.out.println(num2+" is a Strong Number");
		     
		}
	}

}
