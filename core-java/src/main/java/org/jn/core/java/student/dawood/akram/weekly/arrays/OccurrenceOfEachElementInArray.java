package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class OccurrenceOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

          for(int i=0;i<a.length;i++) {
        	  System.out.println("Enter a value : ");
        	  a[i]= scanner.nextInt();
        	  scanner.nextLine();
          }
          int[] occurrences = new int[a.length];
          int countedElement = -1;
          for(int i=0;i<a.length;i++) {
        	  int count = 1;
        	  for(int j=i+1;j<a.length;j++) {
        		  if(a[i]==a[j]) {
        			  count = count+1;
        			  occurrences[j] = countedElement;
        		  }
        	  }
        		  if(occurrences[i]!=countedElement) {
        			  occurrences[i]= count;
        		  }
          }
          
          for(int i=0; i<occurrences.length;i++) {
        	  if(occurrences[i]!= countedElement) {
        		  System.out.println("Element : "+a[i]+" Occurred : "+occurrences[i]+" times.");
        	  }
          }
          scanner.close();
	}

}
