package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Attendee;
import org.jn.adv.arfaz.jdbc.repository.AttendeeRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class AttendeeService {
private Connection con = null;
	
	public AttendeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Attendee> getAll(){
		List<Attendee> AttendeeList = new ArrayList<>();
		if(con!=null) {
			AttendeeList = AttendeeRepository.getAll(con);
		}
		return AttendeeList;
	}
	
	public Attendee findById(int id){
		
		Attendee room = null;
		
		if(con!=null) {
			room = AttendeeRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return AttendeeRepository.deleteById(con, roomId);
	}
	
	public void create(Attendee room) {
		AttendeeRepository.create(con, room);
	}
	
	public void update(Attendee room) {
		AttendeeRepository.update(con, room);
	}

//	public List<Attendee> getByName(String firstName) {
//		return AttendeeRepository.getByFirstName(con, firstName);
//	}
//	public List<Attendee> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return AttendeeRepository.getByDobRange(con, startDate, endDate);
//	}
	
}