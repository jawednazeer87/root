package org.jn.core.java.student.shoaeeb.book;

public class OraclePrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi;
		OraclePrinter op  = new OraclePrinter();
		mi=op;
		mi.connect();
		mi.disconnect();
	}

}
