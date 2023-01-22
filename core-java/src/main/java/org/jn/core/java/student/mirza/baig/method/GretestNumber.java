package org.jn.core.java.student.mirza.baig.method;

public class GretestNumber {
	
	static int great(int [] g) {
		
		int great=0;
		
		for (int i=0 ; i<g.length; i++)

			 
		 if(g[i]>great)
			 great=g[i];

			 
			 System.out.println(great);
		return great;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] g= {1,2,4,8,9,3,160};
		great(g);
	}

}

// int greatest(int[])
// find greatest element of an array and return that greatest value