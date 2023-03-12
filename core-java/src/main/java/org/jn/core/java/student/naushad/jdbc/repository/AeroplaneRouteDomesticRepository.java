package org.jn.core.java.student.naushad.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneRouteDomesticDto;
import org.jn.core.java.student.naushad.jdbc.util.ConnectProvider;

public class AeroplaneRouteDomesticRepository {
	Connection connection = ConnectProvider.getConnect();

	public void create(AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto) {
		String sql = "INSERT INTO aeroplane_route_domestice VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, aeroplaneRouteDomesticDto.getId());
			preparedStatement.setString(2, aeroplaneRouteDomesticDto.getRoute_name());

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(aeroplaneRouteDomesticDto.getDeparture_date().getTime());
			preparedStatement.setDate(3, sqlDate);
			java.sql.Date sqlDate1 = new java.sql.Date(aeroplaneRouteDomesticDto.getArrival_date().getTime());

			preparedStatement.setDate(4, sqlDate1);
			preparedStatement.setString(5, aeroplaneRouteDomesticDto.getDeparture_city());
			preparedStatement.setString(6, aeroplaneRouteDomesticDto.getDeparture_state());
			preparedStatement.setString(7, aeroplaneRouteDomesticDto.getArrival_city());
			preparedStatement.setString(8, aeroplaneRouteDomesticDto.getArrival_state());
			preparedStatement.setString(9, aeroplaneRouteDomesticDto.getCountry());

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

	public void update(AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto) {
		String sql = "UPDATE aeroplane_route_domestice  SET route_name = ? , departure_date = ?, arrival_date = ?, departure_city = ?, departure_state = ?, arrival_city = ?, arrival_state = ?, country = ? WHERE id=? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, aeroplaneRouteDomesticDto.getRoute_name());

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(aeroplaneRouteDomesticDto.getDeparture_date().getTime());
			preparedStatement.setDate(2, sqlDate);
			java.sql.Date sqlDate1 = new java.sql.Date(aeroplaneRouteDomesticDto.getArrival_date().getTime());

			preparedStatement.setDate(3, sqlDate1);
			preparedStatement.setString(4, aeroplaneRouteDomesticDto.getDeparture_city());
			preparedStatement.setString(5, aeroplaneRouteDomesticDto.getDeparture_state());
			preparedStatement.setString(6, aeroplaneRouteDomesticDto.getArrival_city());
			preparedStatement.setString(7, aeroplaneRouteDomesticDto.getArrival_state());
			preparedStatement.setString(8, aeroplaneRouteDomesticDto.getCountry());
			preparedStatement.setInt(9, aeroplaneRouteDomesticDto.getId());

			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data updated successfully: " + executeUpdate);
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
		String sql = "delete from aeroplane_route_domestice where id=?";
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

	public AeroplaneRouteDomesticDto readById(int id) {
		String sql = "select * from aeroplane_route_domestice where id=?";
		AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = new AeroplaneRouteDomesticDto();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				aeroplaneRouteDomesticDto.setId(executeRead.getInt(1));
				aeroplaneRouteDomesticDto.setRoute_name(executeRead.getString(2));
				aeroplaneRouteDomesticDto.setDeparture_date(executeRead.getDate(3));
				aeroplaneRouteDomesticDto.setArrival_date(executeRead.getDate(4));
				aeroplaneRouteDomesticDto.setDeparture_city(executeRead.getString(5));
				aeroplaneRouteDomesticDto.setDeparture_state(executeRead.getString(6));
				aeroplaneRouteDomesticDto.setArrival_city(executeRead.getString(7));
				aeroplaneRouteDomesticDto.setArrival_state(executeRead.getString(8));
				aeroplaneRouteDomesticDto.setCountry(executeRead.getString(9));
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
		return aeroplaneRouteDomesticDto;
	}

	public List<AeroplaneRouteDomesticDto> readAll() {
		String sql = "select * from aeroplane_route_domestice";
		List<AeroplaneRouteDomesticDto> aeroplaneRouteDomesticDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = new AeroplaneRouteDomesticDto();

				aeroplaneRouteDomesticDto.setId(executeRead.getInt(1));
				aeroplaneRouteDomesticDto.setRoute_name(executeRead.getString(2));
				aeroplaneRouteDomesticDto.setDeparture_date(executeRead.getDate(3));
				aeroplaneRouteDomesticDto.setArrival_date(executeRead.getDate(4));
				aeroplaneRouteDomesticDto.setDeparture_city(executeRead.getString(5));
				aeroplaneRouteDomesticDto.setDeparture_state(executeRead.getString(6));
				aeroplaneRouteDomesticDto.setArrival_city(executeRead.getString(7));
				aeroplaneRouteDomesticDto.setArrival_state(executeRead.getString(8));
				aeroplaneRouteDomesticDto.setCountry(executeRead.getString(9));

				aeroplaneRouteDomesticDtos.add(aeroplaneRouteDomesticDto);
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
		return aeroplaneRouteDomesticDtos;
	}

	public List<AeroplaneRouteDomesticDto> readByRouteName(String route_name) {
		String sql = "select * from aeroplane_route_domestice where route_name=?";
		List<AeroplaneRouteDomesticDto> aeroplaneRouteDomesticDtos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, route_name);

			ResultSet executeRead = preparedStatement.executeQuery();
			while (executeRead.next()) {
				AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = new AeroplaneRouteDomesticDto();

				aeroplaneRouteDomesticDto.setId(executeRead.getInt(1));
				aeroplaneRouteDomesticDto.setRoute_name(executeRead.getString(2));
				aeroplaneRouteDomesticDto.setDeparture_date(executeRead.getDate(3));
				aeroplaneRouteDomesticDto.setArrival_date(executeRead.getDate(4));
				aeroplaneRouteDomesticDto.setDeparture_city(executeRead.getString(5));
				aeroplaneRouteDomesticDto.setDeparture_state(executeRead.getString(6));
				aeroplaneRouteDomesticDto.setArrival_city(executeRead.getString(7));
				aeroplaneRouteDomesticDto.setArrival_state(executeRead.getString(8));
				aeroplaneRouteDomesticDto.setCountry(executeRead.getString(9));

				aeroplaneRouteDomesticDtos.add(aeroplaneRouteDomesticDto);
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
		return aeroplaneRouteDomesticDtos;
	}
}
