package org.la.core.java.student.sajid.array.assignment5;

public class Wap20 {

	//wap to check whether two array are equal or not
	//(means we have to check each element of two arrays)
		
		public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4};
	        int[] b = {1, 2, 4, 4};	        
	        
	        
	        
	        boolean isEqual=true;
	        
	        for (int i = 0; i < a.length; i++) {
	            for (int j = i ; j <= i; j++) {
	                if (a[i] != b[j])
	                	isEqual = false;
	            }
	        }

	        if(!isEqual) {
	        	System.out.println("Given two arrays are not equal");
	        }else {
	        	System.out.println("Given two arrays are equal");
	        }
	}

}
