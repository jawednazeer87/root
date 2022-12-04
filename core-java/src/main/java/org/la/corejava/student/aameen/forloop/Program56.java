package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program56 {

	public static void main(String[] args) {
		// Wap to find first and last digit of a number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int firstdigit = 0;
		int lastdigit = num%10;
		
		System.out.println("The lastdigit of a number is : "+lastdigit);
		while(num != 0)
        {
            firstdigit = num% 10;
            num = num / 10;
        }
		System.out.println("first digit of a number is : "+firstdigit);
	}

}
