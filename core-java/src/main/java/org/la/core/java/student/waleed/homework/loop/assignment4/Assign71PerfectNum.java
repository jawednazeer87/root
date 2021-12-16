package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign71PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		       int sum =0; 
		       int n= 28;
               for (int i = 1; i<n; i++) {
            
                   if (n % i == 0) {
                	    
                        sum += i;
                                    }
                            }
               
                   if(sum==n)
                   System.out.println(n+ " is a perfect number");
                   
                   else {
                	   System.out.println(n+ " is not  a perfect number");
                   }
		
		             }

                  }

