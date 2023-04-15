package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Client;
import org.jn.core.java.student.shoaeeb.jdbc.repository.ClientRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class ClientService {
	public static Connection con=null;
		public ClientService() {
			con=GetSqlConnection.getConnection();
		}
	public List<Client> getAllClient(){
		List<Client> list = new ArrayList<>();
		list=ClientRepository.getAllClient(con);
		return list;
		
	}
}
