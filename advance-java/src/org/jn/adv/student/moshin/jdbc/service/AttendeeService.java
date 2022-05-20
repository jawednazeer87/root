package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Attendee;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.repository.AttendeeRepository;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class AttendeeService {

private Connection con = null;
	
	public AttendeeService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Attendee> getAll(){
		List<Attendee> attendeeList = new ArrayList<>();
		if(con!=null) {
			attendeeList = AttendeeRepository.getAll(con);
		}
		return attendeeList;
	}
	
	public Attendee findById(int id){
		
		Attendee attendee = null;
		
		if(con!=null) {
			attendee = AttendeeRepository.findById(con, id);
		}
		
		return attendee;
	}
	
	public int deleteById(int attendee_id) {
		return AttendeeRepository.deleteById(con, attendee_id);
	}
	
	public void create(Attendee attendee) {
		AttendeeRepository.create(con, attendee);
	}
	
	public void update(Attendee attendee) {
		AttendeeRepository.update(con, attendee);
	}

	public List<Attendee> getByName(String firstName) {
		return AttendeeRepository.getByFirstName(con, firstName);
	}
	public List<Attendee> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return AttendeeRepository.getByDobRange(con, startDate, endDate);
	}
	
}
