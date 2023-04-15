package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.CartDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Cart;
import org.jn.core.java.student.shoaeeb.jdbc.service.CartService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CartController {
 public static void main(String args[])
 {
	 CartController cartController = new CartController();
	 //cartController.getAllCart();
	 cartController.updateCartById();
 }
 
 public void getAllCart() {
	 List<Cart> list = new ArrayList<>();
	 CartService cartService = new CartService();
	 list=cartService.getAllCart();
	 for(Cart cart:list)
	 {
		 System.out.println(cart);
	 }
 }
 public void updateCartById() {
	 CartService cartService = new CartService();
	 CartDto cartDto = new CartDto();
	 cartDto.setUUID(1);
	 cartDto.setState("Utar Pradesh");
	 java.sql.Date date = new java.sql.Date(2023-04-11);
	 cartDto.setCreateDate(date);
	 cartDto.setQuantity(1);
	 Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	 String json = gson.toJson(cartDto);
	 Cart cart = gson.fromJson(json,Cart.class);
	 int count=cartService.updateCartById(cart);
	 System.out.println(count+" rows are updated");
	 
	 
 }
}
