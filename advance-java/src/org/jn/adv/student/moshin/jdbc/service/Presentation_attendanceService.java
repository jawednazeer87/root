package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Presentation_attendance;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.repository.Presentation_attendanceRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class Presentation_attendanceService {

private Connection con = null;
	
	public Presentation_attendanceService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Presentation_attendance> getAll(){
		List<Presentation_attendance> presentation_attendanceList = new ArrayList<>();
		if(con!=null) {
			presentation_attendanceList = Presentation_attendanceRepository.getAll(con);
		}
		return presentation_attendanceList;
	}
	
	public Presentation_attendance findById(int id){
		
		Presentation_attendance presentation_attendance = null;
		
		if(con!=null) {
			presentation_attendance = Presentation_attendanceRepository.findById(con, id);
		}
		
		return presentation_attendance;
	}
	
	public int deleteById(int presentation_id) {
		return Presentation_attendanceRepository.deleteById(con, presentation_id);
	}
	
	public void create(Presentation_attendance presentation_attendance) {
		Presentation_attendanceRepository.create(con, presentation_attendance);
	}
	
	public void update(Presentation_attendance presentation_attendance) {
		Presentation_attendanceRepository.update(con, presentation_attendance);
	}

	public List<Presentation_attendance> getByName(Integer presentation_id) {
		return Presentation_attendanceRepository.getByPresentation_id(con, presentation_id);
	}
	
}
