package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Users;

public class UsersRepository {
	public static List<Users> getAll(Connection con) {

		System.out.println("-----------getAllUsers------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Users> UsersList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from users");
			
			if(rs!=null) {
				while(rs.next())  {
					Users room = createObject(rs);
					UsersList.add(room);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return UsersList;
	}
	
	public static Users findById(Connection con, int id) {

		System.out.println("-----------findUsersById Usersid: "+id);

		ResultSet rs = null;
		Users room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from users where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			rs = pStatement.executeQuery();
//			next() will moves the cursor into next row 
			if(rs!=null) {
				while(rs.next())  {
					room = createObject(rs);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return room;
	}
	
	public static void create(Connection con, Users room) {
		
		System.out.println("-----------createUsers------------");
		
		PreparedStatement pStatement = null;
//		12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at )
		try{  
			
			String query = 	  "INSERT INTO users(id, full_name, email, gender, date_of_birth, country_code, created_at) "
							+ " VALUES (?, ?,?,?,?,?,?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setString(2, room.getFull_name());
			pStatement.setString(3, room.getEmail());
			pStatement.setBoolean(4, room.getGender());
			pStatement.setDate(5, Date.valueOf(room.getDate_of_birth()));
			pStatement.setString(6,room.getCountry_code());
			
			pStatement.setDate(7,Date.valueOf(room.getCreated_at()));

			
//			pStatement.setDate(5, Date.valueOf(room.getDob()));
//			pStatement.setBoolean(6, room.getGender());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("data created successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to insert data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 *  id city annual_salary
	 */
	
	public static void update(Connection con, Users room) {
		
		System.out.println("-----------updateUsers------------");
		
		PreparedStatement pStatement = null;
//		 id, full_name, email, gender, date_of_birth, country_code, created_at
		try{  
			
			String query = 	  " update users set full_name=?, email=?, gender=?, date_of_birth=?, country_code=?, created_at=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, room.getFull_name());
			pStatement.setString(2, room.getEmail());
			pStatement.setBoolean(3, room.getGender());
			pStatement.setDate(4, Date.valueOf(room.getDate_of_birth()));
			pStatement.setString(5, room.getCountry_code());
			pStatement.setDate(6, Date.valueOf(room.getCreated_at()));
			pStatement.setInt(7, room.getId());
					
//			pStatement.setBoolean(6, room.getGender());
	
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("data updated successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to update data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int deleteById(Connection con, int id) {

		System.out.println("-----------deleteUsersById Usersid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from users where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, id);
			executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete data: "+executeUpdate);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		
		return executeUpdate;
	}


//	12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at
	private static Users createObject(ResultSet rs) throws SQLException {
		Users room = new Users();
		room.setId(rs.getInt("id"));
		room.setFull_name(rs.getString("full_name"));
		room.setEmail(rs.getString("email"));
		room.setGender(rs.getBoolean("gender"));
		room.setDate_of_birth(rs.getDate("date_of_birth").toLocalDate());
		room.setCountry_code(rs.getString("country_code"));
		room.setCreated_at(rs.getDate("created_at").toLocalDate());
		
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Users> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Users> UsersList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Users Users =
	 * createObject(rs); UsersList.add(Users); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return UsersList; }
	 * 
	 * public static List<Users> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Users> UsersList = new ArrayList<>(); String query =
	 * " select * from Users where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Users Users =
	 * createObject(rs); UsersList.add(Users); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return UsersList; }
	 */		
}
