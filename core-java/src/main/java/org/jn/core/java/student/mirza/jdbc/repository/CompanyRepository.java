package org.jn.core.java.student.mirza.jdbc.repository;

    import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import org.jn.core.java.mirza.jdbc.util.ConnectProvider;
	import org.jn.core.java.student.mirza.jdbc.dto.CompanyDto;


	public class CompanyRepository {

	Connection connection = ConnectProvider.getConnect();

		public void create(CompanyDto companyDto) {
			String sql = "INSERT INTO company VALUES(?,?,?,?)";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, companyDto.getCompanyId());
				preparedStatement.setString(2, companyDto.getName());
				preparedStatement.setString(3, companyDto.getDescription());
				preparedStatement.setInt(4, companyDto.getPrimaryContactAttendeeId());
				

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

		public void update(CompanyDto companyDto) {
			String sql = "UPDATE company SET CompanyId = ?,Name = ?, Description =? , PrimaryContactAttendeeId =? WHERE name=?";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, companyDto.getCompanyId());
				preparedStatement.setString(2, companyDto.getName());
				preparedStatement.setString(3, companyDto.getDescription());
				preparedStatement.setInt(4, companyDto.getPrimaryContactAttendeeId());
				
	          		


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
			String sql = "delete from company where name=?";
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

		public CompanyDto findByCompanyId(int  CompanyId) {
			String sql = "select * from company where name=?";
			 CompanyDto companyDto = new CompanyDto();
			try {
				

				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, CompanyId);

				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					companyDto.setCompanyId(executeRead.getInt(1));
					companyDto.setName(executeRead.getString(2));
					companyDto.setDescription(executeRead.getString(3));
					companyDto.setPrimaryContactAttendeeId(executeRead.getInt(4));
					
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
			return companyDto;
		}

		public List<CompanyDto> readAll() {
			String sql = "select * from company";
			List<CompanyDto> companyDtos = new ArrayList<>();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					CompanyDto companyDto = new CompanyDto();
					
					companyDto.setCompanyId(executeRead.getInt(1));
					companyDto.setName(executeRead.getString(2));
					companyDto.setDescription(executeRead.getString(3));
					companyDto.setPrimaryContactAttendeeId(executeRead.getInt(4));
					
					companyDtos.add(companyDto);
				}

			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
			}
			return companyDtos;
		}

		public List<CompanyDto> findByName(String Name) {
			String sql = "Select * from company where Name like '%" + Name + "%'";
			List<CompanyDto> companyDtos = new ArrayList<>();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet executeRead = preparedStatement.executeQuery();
				while (executeRead.next()) {
					CompanyDto companyDto = new CompanyDto();

					
					
					companyDto.setCompanyId(executeRead.getInt(1));
					companyDto.setName(executeRead.getString(2));
					companyDto.setDescription(executeRead.getString(3));
					companyDto.setPrimaryContactAttendeeId(executeRead.getInt(4));
					companyDtos.add(companyDto);
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
			return companyDtos;
		}

	
		}

		

	


