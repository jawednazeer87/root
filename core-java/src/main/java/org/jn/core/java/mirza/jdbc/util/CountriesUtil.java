package org.jn.core.java.mirza.jdbc.util;

   import org.jn.core.java.student.mirza.jdbc.dto.CountriesDto;
	import org.jn.core.java.student.mirza.jdbc.model.Countries;

	import com.google.gson.Gson;

	public class CountriesUtil {
		
	public static CountriesDto toDtoAuto(Countries countries) {
			Gson gson = new Gson();
			return gson.fromJson(gson.toJson(countries), CountriesDto.class);
			
		}
	}

