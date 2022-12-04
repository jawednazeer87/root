package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class PrimeorNot {

	public static void main(String[] args) {
		// wap to find given number is prime or not
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value ");
		 int num = sc.nextInt();
		 boolean flag = false;
		 
		 for(int i=2;i<=num/2;++i)
		 {
			 if(num%i==0) {
				 flag=true;
			 break;
			 }
			 }
		 if(!flag)
			 System.out.println(num+" : is a prime number ");
		 else
			 System.out.println(num+" : is not a prime number ");

	}

}
