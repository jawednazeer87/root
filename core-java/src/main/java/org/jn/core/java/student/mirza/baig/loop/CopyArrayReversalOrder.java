package org.jn.core.java.student.mirza.baig.loop;

public class CopyArrayReversalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int [] num = {1,3,4,5,6};
		
		int [] b= new int [num.length];
		
		b=num;
		 b[0]++;
		 
		 for (int i=num.length-1; i>=0; i--) {
			 
			 System.out.print(num[i]+" ");
		 }
		 System.out.println();
		 for (int i=1; i<b.length; i++) {
			
			 
			 System.out.print(b[1]+" ");
		 }
	}

}


// wap to copy an array to another array in reverse order