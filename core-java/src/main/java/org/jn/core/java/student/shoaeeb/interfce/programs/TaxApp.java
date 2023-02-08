package org.jn.core.java.student.shoaeeb.interfce.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter state");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		if(name.equals("AP"))
		{
			TaxApp tp = new TaxApp();
			AP a = new AP();
			Tax t = a;
			tp.calculateTax(t);
			
		}
		if(name.equals("karnataka"))
		{
			TaxApp tp = new TaxApp();
			karnataka k = new karnataka();
			Tax t = k;
			tp.calculateTax(t);
		}
	}
	
	void calculateTax(Tax t)
	{
		double ct=1000.00;
		double st=t.stateTax();
		double tax= (ct+st);
		System.out.println(tax);
	}

}
