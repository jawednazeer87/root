package org.jn.core.java.student.mirza.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.mirza.jdbc.util.ConnectProvider;
import org.jn.core.java.student.mirza.jdbc.dto.ClientDto;



public class  ClientRepository {
	Connection connection = ConnectProvider.getConnect();

	public void create(ClientDto clientDto) {
		String sql = "INSERT INTO client VALUES(?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, clientDto.getName());
			preparedStatement.setString(2, clientDto.getAddress());
			preparedStatement.setString(3, clientDto.getCity());
			preparedStatement.setInt(4, clientDto.getZip());
			preparedStatement.setString(5, clientDto.getState());
                        preparedStatement.setString(6, clientDto.getCountry());
                     	preparedStatement.setString(7, clientDto.getEmail());

			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
		    if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	}

	public void update(ClientDto clientDto) {
		String sql = "UPDATE client SET name = ?,address = ?, city =? , zip = ?, state =?, country =?, email =? WHERE name=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			
			
          		preparedStatement.setString(1, clientDto.getName());
			preparedStatement.setString(2, clientDto.getAddress());
			preparedStatement.setString(3, clientDto.getCity());
			preparedStatement.setInt(4, clientDto.getZip());
			preparedStatement.setString(5, clientDto.getState());
                        preparedStatement.setString(6, clientDto.getCountry());
                     	preparedStatement.setString(7, clientDto.getEmail());



			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(int id) {
		String sql = "delete from client where name=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data deleted successfully: " + executeUpdate);
			} else {
				System.out.println("failed to delete data: " + executeUpdate);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public ClientDto findByName(String Name) {
		String sql = "select * from client where name=?";
		 ClientDto clientDto = new ClientDto();
		try {
			

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, Name);

			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				clientDto.setName(executeRead.getString(1));
				clientDto.setAddress(executeRead.getString(2));
				clientDto.setCity(executeRead.getString(3));
				clientDto.setZip(executeRead.getInt(4));
				clientDto.setState(executeRead.getString(5));
                clientDto.setCountry (executeRead.getString(6));
				clientDto.setEmail (executeRead.getString(7));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return clientDto;
	}

	public List<ClientDto> readAll() {
		String sql = "select * from client";
		List<ClientDto> clientDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				ClientDto clientDto = new ClientDto();
				clientDto.setName(executeRead.getString(1));
				clientDto.setAddress(executeRead.getString(2));
				clientDto.setCity(executeRead.getString(3));
				clientDto.setZip(executeRead.getInt(4));
				clientDto.setState(executeRead.getString(5));
                                clientDto.setCountry (executeRead.getString(6));
				clientDto.setEmail (executeRead.getString(7));
				clientDtos.add(clientDto);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
		}
		return clientDtos;
	}

	public List<ClientDto> findByCountry(String Country) {
		String sql = "Select * from client where Name like '%" + Country + "%'";
		List<ClientDto> clientDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				ClientDto clientDto = new ClientDto();

				clientDto.setName(executeRead.getString(1));
				clientDto.setAddress(executeRead.getString(2));
				clientDto.setCity(executeRead.getString(3));
				clientDto.setZip(executeRead.getInt(4));
				clientDto.setState(executeRead.getString(5));
                                clientDto.setCountry (executeRead.getString(6));
				clientDto.setEmail (executeRead.getString(7));
				clientDtos.add(clientDto);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return clientDtos;
	}

	public ClientDto findByZip(int zip) {
		// TODO Auto-generated method stub
		return null;
	}

}
