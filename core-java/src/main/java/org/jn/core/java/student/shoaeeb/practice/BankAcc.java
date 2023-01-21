package org.jn.core.java.student.shoaeeb.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAcc {
	private double bal;
	
	BankAcc(double bal) {
		this.bal=bal;
	}
	
	void contact(double r) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password");
		String pass = br.readLine();
		if(pass.equals("xyzea"))
		{
			Interest in = new Interest();
			in.calculateInterest(r);
		}
		else {
			System.out.println("You are not authorized");
			System.exit(1);
		}
		
		
	}
	
	private class Interest {
		private double r;
		 void calculateInterest(double r)
		{
			double interest = bal*r/100;
			bal+=interest;
			System.out.println("Updated balance "+bal);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAcc account = new BankAcc(100000);
		account.contact(9.5);
	}

}
