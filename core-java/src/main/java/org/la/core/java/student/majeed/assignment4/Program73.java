package org.la.core.java.student.majeed.assignment4;

public class Program73 {

	public static void main(String[] args) {
		// 73.	Wap to check whether a number is Strong number or not.		
		
		  int num = 145;
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
		     else
		      System.out.println(num2+" is not a Strong Number");
	}

}
