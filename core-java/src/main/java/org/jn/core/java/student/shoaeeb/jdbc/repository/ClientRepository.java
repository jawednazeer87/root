package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Client;

public class ClientRepository {
	
	public static List<Client> getAllClient(Connection con) {
		List<Client> list = new ArrayList<>();
		String query = "select * from client";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				Client client = new Client();
				client.setName(rs.getString("name"));
				client.setAddress(rs.getString("address"));
				client.setCity(rs.getString("city"));
				client.setState(rs.getString("state"));
				client.setZip(rs.getString("zip"));
				client.setCountry(rs.getString("country"));
				client.setEmail(rs.getString("email"));
				list.add(client);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
