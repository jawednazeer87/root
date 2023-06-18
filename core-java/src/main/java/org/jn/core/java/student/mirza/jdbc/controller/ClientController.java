
package org.jn.core.java.student.mirza.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.mirza.jdbc.model.Client;
import org.jn.core.java.student.mirza.jdbc.dto.ClientDto;
import org.jn.core.java.student.mirza.jdbc.service.ClientService;

import org.jn.core.java.mirza.jdbc.util.ClientUtil;

public class ClientController {
	
ClientService clientService = new ClientService();

		public static void main(String[] args) {
			ClientController clientController = new ClientController();
			clientController.create();
//			clientController.update();
//			clientController.delete();
//			 clientController.readById();
//			clientController.readAll();
//			clientController.readByCompany_name();
		}

		public void create() {
			Client client = new Client();
			client.setName("mirza");
			client.setAddress("South well Street");
			client.setCity("London");
			client.setZip(411048);
			client.setState("Nothingham");
			client.setCountry("United Kingdom");
			client.setEmail("mirzamohsin792@hotmail.com");

			ClientDto clientDto = ClientUtil.toDtoAuto(client);
			clientService.create(clientDto);

		}

		public void update() {
			Client client = new Client();
			client.setName("Baig");
			client.setAddress("prince wells drive");
			client.setCity("pune");
			client.setZip(411047);
			client.setState("maharashtra");
			client.setCountry("india");
			client.setEmail("wallahhabibee@cometodubai.com");

			;

			ClientDto clientDto = ClientUtil.toDtoAuto(client);
			clientService.update(clientDto);
		}

		public void delete() {
			int Zip = 411048;
			clientService.delete(Zip);
		}

		public void readByZip() {
			int Zip = 411047;
			ClientDto clientDto = ClientService.readByZip(Zip);
			System.out.println(clientDto);
		}

		public void readByName() {
			String Name = "Mirza";
			List<ClientDto> aeroplaneDto = clientService.readByName(Name);
			System.out.println(aeroplaneDto);
		}

		public void readAll() {
			List<ClientDto> clientDto = clientService.readAll();
			System.out.println(clientDto);

		}

	

}



