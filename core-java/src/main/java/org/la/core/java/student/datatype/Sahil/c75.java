package org.la.core.java.student.datatype.Sahil;

public class c75 {
	  public static void main(String[] args) {

	        int i=1, n=10, firstTerm=0,secondTerm=1; //0,1,1,2,3,5,8,13,21

	        while (i<=n){
	            System.out.print(firstTerm+", ");
	            int nextTerm =firstTerm+secondTerm;
	            firstTerm= secondTerm;
	            secondTerm=nextTerm;
	            i++;
	        }

	    }
}
