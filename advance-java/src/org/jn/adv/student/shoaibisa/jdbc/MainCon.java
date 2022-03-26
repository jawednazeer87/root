package org.jn.adv.student.shoaibisa.jdbc;
import org.jn.adv.student.shoaibisa.jdbc.util.GetSqlConnectionStudentDB;

public class MainCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//connection made
		GetSqlConnectionStudentDB.connectionOpen();
		GetSqlConnectionStudentDB.connectionClose();
	}

}
