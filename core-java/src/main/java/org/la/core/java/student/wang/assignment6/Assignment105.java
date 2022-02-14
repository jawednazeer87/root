package org.la.core.java.student.wang.assignment6;

public class Assignment105 {
/*
void printNum(int[], int)
		method will print number if found in array negative number from supplied array
		e.g. if a[]={1,2,3} n b=2 then print 2
		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element
 */
    public void printNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
