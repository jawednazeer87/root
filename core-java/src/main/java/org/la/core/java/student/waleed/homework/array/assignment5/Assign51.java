package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[] n = {7, 91, 67, 129, 89, 17};
		int count = 0;
		
		for(int i=0 ; i<n.length ; i++) {
			int j;
			for(j=2 ; j<n[i] ; j++) {
				if(n[i]%j==0) {
					break;
				}
			}
			if(n[i]==j) 
			{ 
				count++;
				System.out.println("Prime number: "+n[i]);
			}
	
		}

		System.out.println("Counter =  "+count);
		
		
		
	}
	
	
			
	}


