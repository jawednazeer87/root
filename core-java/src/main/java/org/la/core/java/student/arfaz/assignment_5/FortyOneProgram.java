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


//char chr [ ] = {'A', 'B', 'D','E','F', 'G', 'H', 'I','N'};
//
//for (int i =0 ;i<chr.length; i++)
// {
//	 if(chr[i]>='A' && chr[i]<='Z') 
//	 {
//		 chr[i]=   (char)(chr[i] +32);
// System.out.print(chr[i]+" ");
//	 }
//	 
//	}
//for (char arr:chr)
//{
//	 System.out.print(arr+" ");
//    }