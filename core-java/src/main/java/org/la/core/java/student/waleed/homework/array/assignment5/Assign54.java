package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		char chr [ ] = {'a', 'b', '8', 'w','7','z'};
	boolean flag = true;
		for (int i =0 ;i<chr.length; i++)
		 {
			 if(chr[i] =='Z')
			 {
				 System.out.println("This array has Z");
				 flag =false;
				 break;
		 
			 }
		 }
		if(flag==true)
			 System.out.println("This array hasn't have  Z ");
		

     }
   
	

}
