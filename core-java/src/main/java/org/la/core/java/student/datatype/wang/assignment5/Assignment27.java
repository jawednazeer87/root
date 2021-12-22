package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment27 {
    /*
 27) wap to find the index of an array element(here u have to take any number and check that number is
		present inside an array or not,
	    if 	not print -1, if present then print its index means of that element)?
    */
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int element = 0;
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