package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Client;
import org.jn.core.java.student.shoaeeb.jdbc.service.ClientService;

public class ClientController {
	
	public static void main(String args[])
	{
		ClientController controller = new ClientController();
		controller.getAllClient();
	}
	
	public void getAllClient() {
		List<Client> list = new ArrayList<>();
		ClientService service = new ClientService();
		list=service.getAllClient();
		System.out.println(list);
	}
}
