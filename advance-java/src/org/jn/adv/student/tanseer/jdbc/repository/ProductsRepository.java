package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Products;

public class ProductsRepository 
{
	public static void create(Connection con, Products products)
	{
		System.out.println("------- Product Information Inserted---------");
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "INSERT INTO products( merchant_id, name, price, status, created_at )"
			+ "VALUES(?,?,?,?,?)";
			
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, products.getMerchantId());
			pStatement.setString(2, products.getName());
			pStatement.setInt(3, products.getPrice());
			pStatement.setBoolean(4, products.getStatus());
			pStatement.setString(5, products.getCreatedAt());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate > 0) {
				System.out.println("-----Data Inserted Successfully-----"+executeUpdate);
			}
			else {
				System.out.println("-----Failed to inserted data-----"+executeUpdate);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		finally {
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public static List<Products> getAll(Connection con) {

		System.out.println("-----------Getting All Products------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Products> productsList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from products");

			if(rs!=null) {
				while(rs.next())  {
					Products products = createObject(rs);
					productsList.add(products);
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
		return productsList;
		}
	
	private static Products createObject(ResultSet rs) throws SQLException {
		Products products = new Products();
		products.setMerchantId(rs.getInt("merchant_id"));
		products.setName(rs.getString("name"));
		products.setPrice(rs.getInt("price"));
		products.setStatus(rs.getBoolean("status"));
		products.setCreatedAt(rs.getString("created_at"));
		return products;
	}
}


