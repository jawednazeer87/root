package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		char chr [ ] = {'a', 'b', 'c','e','w', 'r', 'h', 'x','n','v'};
		
		for (int i =0 ;i<chr.length; i++)
		 {
			 if(chr[i]>='a' && chr[i]<='z') 
			 {
				 chr[i]=  (char) (chr[i] -32);
		 
			 }
			 
			}
		for (int i =0 ;i<chr.length; i++)
		{
			 System.out.print(chr[i]+" ");
	}
}
}