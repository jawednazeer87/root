package org.jn.core.java.student.mirza.jdbc.repository;




	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import org.jn.core.java.mirza.jdbc.util.ConnectProvider;
	import org.jn.core.java.student.mirza.jdbc.dto.CountriesDto;



	public class CountriesRepository {

		Connection connection = ConnectProvider.getConnect();

		public void create(CountriesDto countriesDto) {
			String sql = "INSERT INTO countries VALUES(?,?,?)";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, countriesDto.getCode());
				preparedStatement.setString(2, countriesDto.getName());
				preparedStatement.setString(3, countriesDto.getCountinentName());
		

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

		public void update(CountriesDto countriesDto) {
			String sql = "UPDATE countries SET Code = ?,Name = ?, CountinentName =? ";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				
				
	          		preparedStatement.setInt(1, countriesDto.getCode());
				preparedStatement.setString(2, countriesDto.getName());
				preparedStatement.setString(3, countriesDto.getCountinentName());
				


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

		public void delete(int Code) {
			String sql = "delete from countries where Code=?";
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, Code);

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

		public CountriesDto findByName(String Name) {
			String sql = "select * from countries where name=?";
			 CountriesDto countriesDto = new CountriesDto();
			try {
				

				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setString(1, Name);

				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					countriesDto.setCode(executeRead.getInt(1));
					countriesDto.setName(executeRead.getString(2));
					countriesDto.setCountinentName(executeRead.getString(3));
				
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
			return countriesDto;
		}

		public List<CountriesDto> readAll() {
			String sql = "select * from countries";
			List<CountriesDto> countriesDtos = new ArrayList<>();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					CountriesDto countriesDto = new CountriesDto();
					countriesDto.setCode(executeRead.getInt(1));
					countriesDto.setName(executeRead.getString(2));
					countriesDto.setCountinentName(executeRead.getString(3));
					countriesDtos.add(countriesDto);
					
				}

			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
			}
			return countriesDtos;
		}

		public List<CountriesDto> findByCode(int Code) {
			
			String sql = "Select * from countries where Name like '%" + Code + "%'";
			List<CountriesDto> countriesDtos = new ArrayList<>();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					CountriesDto countriesDto = new CountriesDto();

					countriesDto.setCode(executeRead.getInt(1));
					countriesDto.setName(executeRead.getString(2));
					countriesDto.setCountinentName(executeRead.getString(3));
					countriesDtos.add(countriesDto);
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
			return countriesDtos;
		}
public List<CountriesDto> findByCountinentName(String CountinentName) {
			
			String sql = "Select * from countries where Name like '%" + CountinentName + "%'";
			List<CountriesDto> countriesDtos = new ArrayList<>();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					CountriesDto countriesDto = new CountriesDto();

					countriesDto.setCode(executeRead.getInt(1));
					countriesDto.setName(executeRead.getString(2));
					countriesDto.setCountinentName(executeRead.getString(3));
					countriesDtos.add(countriesDto);
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
			return countriesDtos;
		

}
}
