package org.jn.core.java.student.shoaeeb.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAcc {
	double balance;
	BankAcc(double balance)
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
		else {
			System.out.println("Wrong Password");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAcc b = new BankAcc(10000);
		b.contact(9.5);
	}
	private class CalculateInterest {
		double r;
		
		CalculateInterest(double r)
		{
			this.r=r;
		}
		
		void calculateInterest()
		{
			double interest;
			interest=balance*r/100;
			balance+=interest;
			System.out.println("update balance is:"+balance);
		}
	}
}
