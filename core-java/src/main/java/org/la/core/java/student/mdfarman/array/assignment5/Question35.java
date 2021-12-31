package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;


public class Question35 {
	//		35) wap to check if an array of integers without 0 and -1?


	
    public static void main(String[] args) {
    	 int arr[] = {1,2,4,7,8,5,4,-1,2,1};
         boolean check = false;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == 0 || arr[i] == -1) {
                 check = true;
                 break;
             }
         }
         System.out.println(Arrays.toString(arr));
         System.out.println(check);
    }
}
