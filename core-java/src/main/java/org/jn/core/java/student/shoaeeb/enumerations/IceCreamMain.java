package org.jn.core.java.student.shoaeeb.enumerations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IceCreamMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Available IceCreams");
		for(IceCream ice: IceCream.values())
		{
			int no=ice.ordinal();
			System.out.println(no+" "+ice);
		}
		System.out.println("enter choices");
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br.readLine());
		IceCream.getPrice(choice);
	}

}
