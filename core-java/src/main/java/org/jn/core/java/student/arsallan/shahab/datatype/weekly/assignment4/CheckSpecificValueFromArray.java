package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;
import java.util.Scanner;

public class CheckSpecificValueFromArray {

	public static void main(String[] args) {
		int array[] = {3,2,1,4,7,6,5,8,9,3,4};
		System.out.println("enter the number tp check: ");
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		for(int x:array) {
			if(x==input) {
				count++;
			}
		}
		System.out.println(count==0?"no in the array":"present in array");

		scan.close();
	}

}
