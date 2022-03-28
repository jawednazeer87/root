package org.jn.adv.jawed.jdbc;

import org.jn.adv.jawed.util.GetSqlConnection;

/**
 * @author jawednazeer
 */
public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello world advance");
		GetSqlConnection.connectionOpen();
		GetSqlConnection.connectionClose();
	}
}
