package org.jn.core.java.student.shoaeeb.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccount {
	double balance;
	BankAccount(double balance)
	{
		this.balance=balance;
	}
	
	void contact(double r) throws IOException
	{
		String password;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		password=br.readLine();
		if(password.equals("xyzs"))
		{
			CalculateInterest c = new CalculateInterest(r);
			c.calculateInterest();
		}
	}
	private class CalculateInterest
	{
		double rate;
		CalculateInterest(double r)
		{
			this.rate=r;
		}
		void calculateInterest() {
			double interest=balance*rate/100;
			balance+=interest;
			System.out.println("Updated balance is: "+balance);
			
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAccount b= new BankAccount(10000);
		b.contact(9.5);
	}

}
