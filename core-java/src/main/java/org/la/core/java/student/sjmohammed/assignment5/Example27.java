package org.la.core.java.student.sjmohammed.assignment5;

public class Example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 3, 1, 7};
        int element = 1;
        boolean isContains =false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isContains= true;
                System.out.println("the array contains the element " + element+" , and the index is "+i);
                break;
            }
        }
        if (isContains==false){
            System.out.println("-1");
        }	
	}

}
