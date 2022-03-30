package org.jn.adv.student.moshin.jdbc.util;

public class ConnectMain {

	
	public static void main(String[] args) {
    //System.out.println(" Hellow mySql");
    GetSqlConnection.connectionOpen();
    GetSqlConnection.connectionClose();

	}

}
