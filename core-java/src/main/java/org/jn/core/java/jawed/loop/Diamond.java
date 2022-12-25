package org.jn.core.java.jawed.loop;

public class Diamond {

	public static void main(String[] args) {
		int n = 3;
		for(int i=-n ; i<=n ; i++) {
			
			int j=i;
			if(j<0){
				j = -j;
			}
			
			//printing space
			for(int k=1 ; k<=j ; k++) {
				System.out.print(" ");
			}
			//printing star
			for(int k=0 ; k<=n-j ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}