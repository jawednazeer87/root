	package org.la.core.java.student.arfaz.assignment_5array;



/*  	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'*/

	

public class FiftyThreeProgram {

	public static void main(String[] args) {

		char c[]= {'A', '5', '7', 'p'},f=0; 
		
		
		for(int i=0;i<c.length;i++)  {
			  if(c[i] =='a')
				  f=1;
				  
			 	
		}
		if(f==1)
			System.out.println("this array has 'a'");
		else
			System.out.println("this array doesn't have 'a'");
			}

			 
				
		
	}


