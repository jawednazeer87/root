package org.jn.core.java.mirza.jdbc.util;



import org.jn.core.java.student.mirza.jdbc.model.Aeroplane;
import org.jn.core.java.student.mirza.jdbc.dto.AeroplaneDto;
import com.google.gson.Gson;

public class AeroplaneUtil {
	public static AeroplaneDto toDtoAuto(Aeroplane aeroplane) {
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(aeroplane), AeroplaneDto.class);
		
		
	}
	
}