package org.jn.core.java.student.naushad.jdbc.repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AttendeeDto;
import org.jn.core.java.student.naushad.jdbc.util.ConnectProvider;

public class AttendeeRepository {
	Connection connection = ConnectProvider.getConnect();

	public void create(AttendeeDto attendeeDto) {
		String sql = "INSERT INTO attendee VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, attendeeDto.getAttendeeDto_id());
			preparedStatement.setString(2, attendeeDto.getFirst_name());
			preparedStatement.setString(3, attendeeDto.getLast_name());
			preparedStatement.setLong(4, attendeeDto.getPhn_no());
			preparedStatement.setString(5, attendeeDto.getEamil());
			preparedStatement.setBoolean(6, attendeeDto.isVip());

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

	public void update(AttendeeDto attendeeDto) {
		String sql = "UPDATE attendee SET first_name =  ? ,last_name = ?,  phone_no = ? , email = ? , vip =  ?  WHERE attendee_id = ? ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, attendeeDto.getFirst_name());
			preparedStatement.setString(2, attendeeDto.getLast_name());
			preparedStatement.setLong(3, attendeeDto.getPhn_no());
			preparedStatement.setString(4, attendeeDto.getEamil());
			preparedStatement.setBoolean(5, attendeeDto.isVip());
			preparedStatement.setInt(6, attendeeDto.getAttendeeDto_id());

			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data updated successfully: " + executeUpdate);
			} else {
				System.out.println("failed to update data: " + executeUpdate);
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
		String sql = "delete from attendee where attendee_id=?";
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

	public AttendeeDto findById(int id) {
		String sql = "Select * from attendee where attendee_id=?";
		AttendeeDto attendeeDto = new AttendeeDto();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet executeRead = preparedStatement.executeQuery();

			while (executeRead.next()) {

				attendeeDto.setAttendeeDto_id(executeRead.getInt(1));
				attendeeDto.setFirst_name(executeRead.getString(2));
				attendeeDto.setLast_name(executeRead.getString(3));
				attendeeDto.setPhn_no(executeRead.getLong(4));
				attendeeDto.setEamil(executeRead.getString(5));
				attendeeDto.setVip(executeRead.getBoolean(6));
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
		return attendeeDto;

	}

	public List<AttendeeDto> readAll() {
		String sql = "select * from attendee";
		List<AttendeeDto> attendeeDtos = new ArrayList<>();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet executeRead = statement.executeQuery();

			while (executeRead.next()) {
				AttendeeDto attendeeDto = new AttendeeDto();

				attendeeDto.setAttendeeDto_id(executeRead.getInt(1));
				attendeeDto.setFirst_name(executeRead.getString(2));
				attendeeDto.setLast_name(executeRead.getString(3));
				attendeeDto.setPhn_no(executeRead.getLong(4));
				attendeeDto.setEamil(executeRead.getString(5));
				attendeeDto.setVip(executeRead.getBoolean(6));

				attendeeDtos.add(attendeeDto);

			}
			System.out.println();
			System.out.println("READ ALL OPERATION EXECUTED");
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
		return attendeeDtos;
	}

	public List<AttendeeDto> findByName(String name) {
		String sql = "Select * from attendee where first_name like '%" + name + "%'";
		List<AttendeeDto> attendeeDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet executeRead = preparedStatement.executeQuery();

			while (executeRead.next()) {
				AttendeeDto attendeeDto = new AttendeeDto();
				attendeeDto.setAttendeeDto_id(executeRead.getInt(1));
				attendeeDto.setFirst_name(executeRead.getString(2));
				attendeeDto.setLast_name(executeRead.getString(3));
				attendeeDto.setPhn_no(executeRead.getLong(4));
				attendeeDto.setEamil(executeRead.getString(5));
				attendeeDto.setVip(executeRead.getBoolean(6));

				attendeeDtos.add(attendeeDto);

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
		return attendeeDtos;
	}
}
