package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char chr [ ] = {'A', 'B', 'C','W','T', 'R', 's', 'X','Y','Z'};
		
		for (int i =0 ;i<chr.length; i++)
		 {
			 if(chr[i]>='A' && chr[i]<='Z') 
			 {
				 chr[i]=  (char) (chr[i] +32);
		 
			 }
			 
			}
		for (int i =0 ;i<chr.length; i++)
		{
			 System.out.print(chr[i]+" ");
	}

}

		
	}


