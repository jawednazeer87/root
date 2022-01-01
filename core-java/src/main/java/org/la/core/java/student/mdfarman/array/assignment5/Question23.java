package org.la.core.java.student.mdfarman.array.assignment5;


public class Question23 {
	//	23) wap to count occurrences of each element in an array?

	public static void main(String[] args) {

		int arr[] = {8,4,5,7,6,5,4,9,8,5,2,4,5,8,4,5,2};  
		int fre[] = new int [arr.length];  
		int checked = -1;  
		
		for(int i = 0; i < arr.length; i++){  
			int count = 1;  
			
			for(int j = i+1; j < arr.length; j++){  
				if(arr[i] == arr[j]){  
					count++;  
					fre[j] = checked;  
				}  
			}  
			if(fre[i] != checked)  
				fre[i] = count;  
		}  

		for(int i = 0; i < fre.length; i++){  
			if(fre[i] != checked)  
				System.out.println(arr[i] + " : " + fre[i]);  
		}  
	}
}
