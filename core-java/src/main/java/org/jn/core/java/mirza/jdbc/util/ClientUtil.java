package org.jn.core.java.mirza.jdbc.util;

import org.jn.core.java.student.mirza.jdbc.dto.ClientDto;
import org.jn.core.java.student.mirza.jdbc.model.Client;

import com.google.gson.Gson;

public class ClientUtil {
	
public static ClientDto toDtoAuto(Client client) {
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(client), ClientDto.class);
		
	}
}
