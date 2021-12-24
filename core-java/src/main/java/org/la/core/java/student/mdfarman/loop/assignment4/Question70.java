package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question70 {

	//		70.	Wap to print all Armstrong numbers between 1 to n.

	public static void main(String[] args) {

		int counter=0;

		Scanner scanner = new Scanner(System.in);
		int start = 1;
		System.out.print("Enter the end number: ");
		int end = scanner.nextInt();
		scanner.close();

		//generate Armstrong numbers between start and end
		for(int i=start+1; i<end; i++){
			int temp = i;
			int num = 0;
			while(temp != 0){
				int rem = temp%10;
				num = num + rem*rem*rem;
				temp = temp/10;
			}
			if(i == num){
				if(counter == 0)
					System.out.println("Armstrong Numbers Between "+start+" and "+end+": ");
				
				System.out.print(i + "  ");
				counter++;
			}
		}
		// if no Armstrong number is found
		if(counter == 0)
			System.out.print("There is no Armstrong number Between "+start+" and "+end);
		

	}
}