package org.la.core.java.student.sajid.method.assignment6;

public class Wap28 {

	public static void main(String[] args) {
		// 28)	void diamond(int n)
		//print diamond
		
		int i=5;
		diamond(i);
	}

		static void diamond(int a) {
	
			for(int i=-a ; i<=a ; i++) {
				
				int j=i;
				if(j<0){
					j = -j;
				}
				
				for(int k=1 ; k<=j ; k++) {
					System.out.print(" ");
				}
				
				for(int k=0 ; k<=a-j ; k++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}		
}
