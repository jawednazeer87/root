package org.jn.core.java.student.shoaeeb.interfce.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrinterMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Printer p;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Printer Name you want to connect to...Samsung or Panasonic");
		String printerName=br.readLine();
		if(printerName.equals("Samsung"))
		{
			SamsungPrinter sp = new SamsungPrinter();
			p=sp;
			PrinterMain m  = new PrinterMain();
			m.Printer(p);
		}
		if(printerName.equals("Panasonic"))
		{
			PanasonicPrinter sp = new PanasonicPrinter();
			p=sp;
			PrinterMain m  = new PrinterMain();
			m.Printer(p);
		}
	}
	
	void Printer(Printer p) {
		p.connect();
		p.disconnect();
	}

}
