package org.la.core.java.student.majeed.assignment3;

public class Program48 {

	public static void main(String[] args) {
		//48. wap to find least number among three numbers
		int i = 150, j = 280, k = 370;
		if ((i < j) && (i < k)) {			
			System.out.println("i is least: "+i);
		}
		else if ((j < i) && (j < k)) { 
			System.out.println("j is least: "+j);		
		}
		else if ((k < i) && (k < j)) {			
			System.out.println("k is least: "+k);		
		}
	}

}
