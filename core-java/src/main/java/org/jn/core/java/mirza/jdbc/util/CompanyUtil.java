package org.jn.core.java.mirza.jdbc.util;

	import org.jn.core.java.student.mirza.jdbc.dto.CompanyDto;
	import org.jn.core.java.student.mirza.jdbc.model.Company;

	import com.google.gson.Gson;

	public class CompanyUtil {
		
	public static CompanyDto toDtoAuto(Company company) {
			Gson gson = new Gson();
			return gson.fromJson(gson.toJson(company), CompanyDto.class);
			
		}
	}
	
	
	


