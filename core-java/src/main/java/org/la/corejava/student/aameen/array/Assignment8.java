package org.la.corejava.student.aameen.array;
import java.util.Scanner;
public class Assignment8 {
	public static void main(String[] args) {
		//wap to print number divisible by given number from an array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be divider : ");
		int num=sc.nextInt();
		System.out.println("Number  divisible by given number from an array , num:"+num);
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%num==0)
			{
				System.out.println(" a{"+i+"] : "+a[i]);
			}
		}
		
	}
}
