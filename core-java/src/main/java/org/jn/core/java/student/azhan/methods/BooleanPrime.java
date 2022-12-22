package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class BooleanPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nummber: ");
		int a = sc.nextInt();
		boolean res = prime(a);
		System.out.println(a+" is Prime Nummber: "+res);
	}
	static boolean prime(int x)
	{
		if(x==1)
			return false;
		for(int i=2; i<=x/2; i++)
			if(x%i==0)
				return false;
		return true;
	}

}
