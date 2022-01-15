package org.la.core.java.student.sajid.array.assignment5;

public class Wap23 {

	public static void main(String[] args) {
		// wap to count occurrences of each element in an array?
		
		int arr[] = {3,4,3,5,4,4,3};
						
		System.out.println("Count of each element in an array");
		
		int [] count = new int[100];

        int i,tmp = 0;
        for(i = 0; i < arr.length; i++){
                tmp = arr[i];
                count[tmp]++;
        }
        for(i=1; i < count.length; i++){
            if(count[i] > 0 && count[i] == 1){
                System.out.printf("%d occurs %d times\n",i, count[i]);
             }
            else if(count[i] >= 2){
                System.out.printf("%d occurs %d times\n",i, count[i]);
            }
	}
	}
}
