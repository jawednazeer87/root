package org.jn.adv.student.tanseer.jdbc;

import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class Main 
{
	public static void main(String[] args) 
	{
		GetSqlConnection.connectionOpen();
		GetSqlConnection.connectionClose();
	}
}
