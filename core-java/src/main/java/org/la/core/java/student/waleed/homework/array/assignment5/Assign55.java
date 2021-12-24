package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int chr [ ] = {'A', 'B', 'c','a','t', '7', '9', 'x','1','Z'};
		
		for (int i =0 ;i<chr.length; i++)
		 {
			 if((chr[i]>='A' && chr[i]<='Z') || (chr[i]>='a' && chr[i]<='a') || (chr[i]>='0' && chr[i]<='9')) 
			 {
				 chr[i]=  (int) chr[i];
		 
			 }
			 
			}
		for (int i =0 ;i<chr.length; i++)
		{
			 System.out.print(chr[i]+" ");
		
		
	}

}
}
