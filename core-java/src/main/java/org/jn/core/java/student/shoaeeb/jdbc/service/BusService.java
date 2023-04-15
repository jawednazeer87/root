package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bus;
import org.jn.core.java.student.shoaeeb.jdbc.repository.BusRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BusService {
	private static  Connection con=null;
     public BusService() {
    	 con=GetSqlConnection.getConnection();
     }
     
     public List<Bus> getAllBus()
     {
    	 List<Bus> list = new ArrayList<>();
    	 list =  BusRepository.getAllBus(con);
    	 return list;
    	
     }
     public Bus findBusById(int id) {
    	 Bus b = new Bus();

    	 b=BusRepository.findBusById(con, id);
    	 return b;
     }
}
