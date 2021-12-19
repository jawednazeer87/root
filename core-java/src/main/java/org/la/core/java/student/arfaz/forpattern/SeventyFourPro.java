	package org.la.core.java.student.arfaz.forpattern;

//Wap to check whether a number is Strong number or not. 1! + 4! + 5! = 1 + 24 + 120 = 145

public class SeventyFourPro {
	public static void main(String[] args) {
		int n=145, s1=0,temp=0,rem,fact;
		temp=n;
	       for(;n!=0;)   {
	    	   rem = n%10;
	    	   fact = 1;
	    	   	   for(int i=1;i<=rem;i++)
	    		   fact=fact*i;
	    	   s1=s1+fact;
	    	   n=n/10;
	       }
	       if(s1==temp)
	    	   System.out.println(s1);
	       else
	    	   System.out.println("not strong");
	}

		
	
		
}
