package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign42PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 int i,m=0, flag=0;
		 int n =21;// It's the number to be checked
		 m=n/2;
		 
			 for(i=2;i<=m;i++){
			 if(n%i==0) {
				 System.out.println(n +" is not prime number");
                flag=1;
				break; 
			 }
			 }
			 if(flag==0) {
				 System.out.println(n +" is  prime number");
			}
			 }
		 }
				 
		    
		

	


