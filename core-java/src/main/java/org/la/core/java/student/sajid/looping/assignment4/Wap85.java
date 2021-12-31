package org.la.core.java.student.sajid.looping.assignment4;

public class Wap85 {

	public static void main(String[] args) {
		// Wap to print following pattern
				//	   1
				//   2 2
			    // 2 2 3
				
				int limit = 3;
				
				for(int i=1;i<=limit;i++) {
					
					for(int k=limit-1;k>=i;k--) {
					System.out.print("  ");
					}
					
					for(int j=1;j<=i;j++) {
						System.out.print(i+" ");
					}
					System.out.println("");
				}

	}

}
