package org.jn.core.java.student.azhan.methods;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		int a = sc.nextInt();
		System.out.print("Enter second nummber: ");
		int b = sc.nextInt();
		int sum = add(a,b);
		System.out.println("Sum = "+sum);
	}
	static int add(int x, int y)
	{
		return x+y;
	}

}
