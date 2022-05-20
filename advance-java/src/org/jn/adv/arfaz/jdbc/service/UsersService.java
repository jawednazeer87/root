package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Users ;
import org.jn.adv.arfaz.jdbc.repository.UsersRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class UsersService {
private Connection con = null;
	
	public UsersService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Users > getAll(){
		List<Users > UsersList = new ArrayList<>();
		if(con!=null) {
			UsersList = UsersRepository.getAll(con);
		}
		return UsersList;
	}
	
	public Users  findById(int id){
		
		Users  sal_emp = null;
		
		if(con!=null) {
			sal_emp = UsersRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return UsersRepository.deleteById(con, employee_id );
	}
	
	public void create(Users  sal_emp) {
		UsersRepository.create(con, sal_emp);
	}
	
	public void update(Users  sal_emp) {
		UsersRepository.update(con, sal_emp);
	}

//	public List<Users > getByName(String firstName) {
//		return Users Repository.getByFirstName(con, firstName);
//	}
//	public List<Users > getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return Users Repository.getByDobRange(con, startDate, endDate);
//	}
	
}