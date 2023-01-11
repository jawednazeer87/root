package org.jn.core.java.student.shoaeeb.dsa;
import java.util.*;
import java.lang.Math;
public class ArmstrongNum {
	
	public static int armstrongNum(int n)
	{
		int res=0;
		while(n!=0)
		{
			int rem=n%10;
			res+=Math.pow(rem,3);
			n=n/10;
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int originalNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		originalNum=n;
		sc.close();
		int a=armstrongNum(n);
		if(a==originalNum)
		{
			System.out.println(originalNum+ " is a palindrome");
		}
		else {
			System.out.println(originalNum+ " is not palindrome");
		}
	}

}
