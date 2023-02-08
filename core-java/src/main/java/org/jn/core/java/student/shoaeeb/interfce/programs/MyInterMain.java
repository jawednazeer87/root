package org.jn.core.java.student.shoaeeb.interfce.programs;

public class MyInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printerName = args[0];
		if(printerName.equals("OracleDB"))
		{
			OracleDB Ob  = new OracleDB();
			MyInter mi = Ob;
			mi.connect();
			mi.disconnect();
		}
		if(printerName.equals("EpsonPrinter"))
		{
			EpsonPrinter eP = new EpsonPrinter();
			MyInter mi = eP;
			mi.connect();
			mi.disconnect();
		}
	}

}
