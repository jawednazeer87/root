package org.la.core.java.student.moshin.assignment6;

public class Assignment12 {
	
		public static void main(String[] args) {
			
			 
			int a[] = {199,1,77,12,375};
			int b[] = {1,999,23,188,25};
			int c [] =  addTwoArrays(a,b);
			int index= 0;
			for (int i : c) {
				
			
				System.out.println("c["+index+"] = "+i+"");
				index++;
			  }
		  }
		static int [] addTwoArrays(int[] a, int []b) {
			int c [] = new int[a.length];
			
			for (int i=0;i<=a.length-1;i++) {
				c[i]=a[i] + b[i];
				}
			
		
			return c;
			
			

		}

	}
