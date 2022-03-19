package org.jn.adv.waleed.jdbc.myutil;



/**
 * @author Waleed Rizq
 *
 * @date Mar 13, 2022
 */
public class ConnectMain {

	
	public static void main(String[] args) {
    //System.out.println(" Hellow mySql");
    GetSqlConnection1.connectionOpen();
    GetSqlConnection1.connectionClose();

	}

}
