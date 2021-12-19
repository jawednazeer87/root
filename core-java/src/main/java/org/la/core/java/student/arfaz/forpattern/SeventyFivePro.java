	package org.la.core.java.student.arfaz.forpattern;

//print all Strong numbers between 1 to n. 1! + 4! + 5! = 1 + 24 + 120 = 145

public class SeventyFivePro {
	public static void main(String[] args) {
		int n=1000, s1,tmp=0,rem,fact;
		for(int i=1;i<=n;i++)   {
			tmp=i;
			
			s1=0;
		       for(;tmp!=0;)   {
		    	   rem = tmp%10;
		    	   fact = 1;
		    	   	   for(int j=1;j<=rem;j++)
		    	   		   		fact=fact*j;
		    	   s1=s1+fact;
		    	   tmp=tmp/10;
		       }
		       if(s1==i)
		    	   System.out.println(s1);
		     
		}
		
	}

		
	
		
}
