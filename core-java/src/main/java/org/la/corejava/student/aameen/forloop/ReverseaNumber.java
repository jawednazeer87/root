package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class ReverseaNumber {

	public static void main(String[] args) {
		// wap to reverse a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed ");
		int num = sc.nextInt();
		int reverse= 0;
		for(;num!=0;)
		{
			reverse=reverse*10;
			reverse= reverse+num%10;
			num=num/10;
			
		}
		System.out.println("The reverse of the given number is : "+reverse);

	}

}
