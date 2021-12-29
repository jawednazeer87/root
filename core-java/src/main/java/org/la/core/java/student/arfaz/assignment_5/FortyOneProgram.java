	package org.la.core.java.student.arfaz.assignment_5;



/*  	wap to convert an array of characters from upper case to lower case, e.g if arr[] = {'a', 'b', 'C'} 
		then after conversion final array should be arr[] = {'A', 'B', 'C'} */

public class FortyOneProgram {

	public static void main(String[] args) {

			char cr[]= {'a', 'b', 'C'};
			
			
			for(int i=0;i<cr.length;i++)  {
			if(Character.isLowerCase(cr[i]))
				cr[i]=Character.toUpperCase(cr[i]);
//					
		}
			
				for(char a:cr) 
					System.out.println(a);
					
	}

}
