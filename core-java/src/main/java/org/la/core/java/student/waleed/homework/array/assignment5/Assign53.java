package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		char chr [ ] = {'a', 'b', '8', 'w','7','z'};
		
	boolean flag = true;
		for (int i =0 ;i<chr.length; i++)
		 {
			 if(chr[i] =='a')
			 {
				 System.out.println("This array has a");
				 flag =false;
				 break;
		 
			 }
		 }
		if(flag==true)
			 System.out.println("This array hasn't have  a ");
		char b = '7';
		 System.out.println( b );
	}

}
