package org.jn.core.java.student.naushad.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import org.jn.core.java.student.naushad.jdbc.util.ConnectProvider;

public class AeroplaneRepository {
	Connection connection = ConnectProvider.getConnect();

	public void create(AeroplaneDto aeroplaneDto) {
		String sql = "INSERT INTO aeroplane VALUES(?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, aeroplaneDto.getId());
			preparedStatement.setString(2, aeroplaneDto.getName());
			preparedStatement.setInt(3, aeroplaneDto.getCapacity());
			preparedStatement.setString(4, aeroplaneDto.getCompany_name());
			preparedStatement.setString(5, aeroplaneDto.getModel_name());

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

	public void update(AeroplaneDto aeroplaneDto) {
		String sql = "UPDATE aeroplane SET name = ?,capacity = ?, company_name =? , model_name = ? WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, aeroplaneDto.getName());
			preparedStatement.setInt(2, aeroplaneDto.getCapacity());
			preparedStatement.setString(3, aeroplaneDto.getCompany_name());
			preparedStatement.setString(4, aeroplaneDto.getModel_name());

			preparedStatement.setInt(5, aeroplaneDto.getId());

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
		String sql = "delete from aeroplane where id=?";
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

	public AeroplaneDto findById(int id) {
		String sql = "select * from aeroplane where id=?";
		AeroplaneDto aeroplaneDto = new AeroplaneDto();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				aeroplaneDto.setId(executeRead.getInt(1));
				aeroplaneDto.setName(executeRead.getString(2));
				aeroplaneDto.setCapacity(executeRead.getInt(3));
				aeroplaneDto.setCompany_name(executeRead.getString(4));
				aeroplaneDto.setModel_name(executeRead.getString(5));
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
		return aeroplaneDto;
	}

	public List<AeroplaneDto> readAll() {
		String sql = "select * from aeroplane";
		List<AeroplaneDto> aeroplaneDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				AeroplaneDto aeroplaneDto = new AeroplaneDto();
				aeroplaneDto.setId(executeRead.getInt(1));
				aeroplaneDto.setName(executeRead.getString(2));
				aeroplaneDto.setCapacity(executeRead.getInt(3));
				aeroplaneDto.setCompany_name(executeRead.getString(4));
				aeroplaneDto.setModel_name(executeRead.getString(5));
				aeroplaneDtos.add(aeroplaneDto);
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
		return aeroplaneDtos;
	}

	public List<AeroplaneDto> findByCompany_Name(String company_name) {
		String sql = "Select * from aeroplane where company_name like '%" + company_name + "%'";
		List<AeroplaneDto> aeroplaneDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				AeroplaneDto aeroplaneDto = new AeroplaneDto();
				aeroplaneDto.setId(executeRead.getInt(1));
				aeroplaneDto.setName(executeRead.getString(2));
				aeroplaneDto.setCapacity(executeRead.getInt(3));
				aeroplaneDto.setCompany_name(executeRead.getString(4));
				aeroplaneDto.setModel_name(executeRead.getString(5));
				aeroplaneDtos.add(aeroplaneDto);
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
		return aeroplaneDtos;
	}
}
