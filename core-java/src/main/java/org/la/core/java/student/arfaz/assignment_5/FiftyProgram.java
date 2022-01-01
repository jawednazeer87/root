	package org.la.core.java.student.arfaz.assignment_5;



/*  	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20*/

	

public class FiftyProgram {

	public static void main(String[] args) {

		int n[]= {100, 30, -20, 0},fs=0,temp=0; 
		
		
		for(int i=0;i<n.length;i++)  {
			  fs=0;
			for(int j=i+1;j<n.length;j++)   {
				if(n[i]>n[j]) {
					fs=1;
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
			if(fs==0)
				break;
		}
		System.out.println(n[n.length-1]);
		System.out.println(n[0]);
	}

			 
				
		
	}


