package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Cart;
import org.jn.core.java.student.shoaeeb.jdbc.repository.CartRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class CartService {
	public static Connection con = null;
	public CartService() {
		con=GetSqlConnection.getConnection();
	}
	public List<Cart> getAllCart()
	{
		List<Cart> list = new ArrayList<>();
		list=CartRepository.getAllCart(con);
		return list;
	}
	
	public int updateCartById(Cart cart) {
		int count=CartRepository.updateCartById(con, cart);
		return count;
	}
}
