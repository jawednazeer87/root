package org.jn.core.java.student.mirza.baig.method;

public class NumPositve {
	
	public static void printPositive (int []arr) {
		
		for (int val :arr) {
			
			if (val > 0)
				System.out.println(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []	arr = {20,10,45,-35,-10,-25};
		printPositive(arr);
			
			
		}
	}


