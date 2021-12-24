package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a =  {11, 7, 13, 77, 25, 21, 7, 11, 77,25};   
       
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[i]);  
            }  
		
		
	}

	}
}
