package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Brands;
import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.repository.BrandsRepository;
import org.jn.adv.student.moshin.jdbc.repository.CountriesRepository;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class BrandsService {

private Connection con = null;
	
	public BrandsService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Brands> getAll(){
		List<Brands> brandsList = new ArrayList<>();
		if(con!=null) {
			brandsList = BrandsRepository.getAll(con);
		}
		return brandsList;
	}
	
	public Brands findById(int id){
		
		Brands brands = null;
		
		if(con!=null) {
			brands = BrandsRepository.findById(con, id);
		}
		
		return brands;
	}
	
	public int deleteById(int id) {
		return BrandsRepository.deleteById(con, id);
	}
	
	public void create(Brands brands) {
		BrandsRepository.create(con, brands);
	}
	
	public void update(Brands brands) {
		BrandsRepository.update(con, brands);
	}

	public List<Brands> getByName(String brand_name) {
		return BrandsRepository.getByBrand_name(con, brand_name);
	}
	public List<Brands> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return BrandsRepository.getByDobRange(con, startDate, endDate);
	}
	
}
