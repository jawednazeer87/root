package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = new int[5];
          Scanner scanner = new Scanner(System.in);
       
          for(int i=0;i<arr.length;i++) {
        	  System.out.println("Enter a value at position-"+i);
        	  arr[i]= scanner.nextInt();
        	  scanner.nextLine();
          }
          int countedElement = -1;
          for(int j=0;j<arr.length;j++) {
        	  int count = 1;
        	  for(int k=j+1;k<arr.length;k++) {
        		  if(arr[j]==arr[k]) {
        			        count++;	
        			        if(count>1) {
        			        	arr[k]= countedElement;
        			        }
        		  }
        	  }
        	  if(arr[j]!=countedElement && count>1) {
        		  System.out.println("Duplicate Element : "+arr[j]);
        	  }
          }
      	
          scanner.close();
	}

}
