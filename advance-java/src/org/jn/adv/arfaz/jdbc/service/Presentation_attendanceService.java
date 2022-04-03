package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Presentation_attendance;
import org.jn.adv.arfaz.jdbc.repository.Presentation_attendanceRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class Presentation_attendanceService {
private Connection con = null;
	
	public Presentation_attendanceService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Presentation_attendance> getAll(){
		List<Presentation_attendance> Presentation_attendanceList = new ArrayList<>();
		if(con!=null) {
			Presentation_attendanceList = Presentation_attendanceRepository.getAll(con);
		}
		return Presentation_attendanceList;
	}
	
	public Presentation_attendance findById(int id){
		
		Presentation_attendance ticket = null;
		
		if(con!=null) {
			ticket = Presentation_attendanceRepository.findById(con, id);
		}
		
		return ticket;
	}
	
	public int deleteById(int ticketId) {
		return Presentation_attendanceRepository.deleteById(con, ticketId);
	}
	
	public void create(Presentation_attendance ticket) {
		Presentation_attendanceRepository.create(con, ticket);
	}
	
	public void update(Presentation_attendance ticket) {
		Presentation_attendanceRepository.update(con, ticket);
	}

//	public List<Presentation_attendance> getByName(String firstName) {
//		return Presentation_attendanceRepository.getByFirstName(con, firstName);
//	}
//	public List<Presentation_attendance> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return Presentation_attendanceRepository.getByDobRange(con, startDate, endDate);
//	}
	
}