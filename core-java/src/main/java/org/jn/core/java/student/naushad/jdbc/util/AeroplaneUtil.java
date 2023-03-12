package org.jn.core.java.student.naushad.jdbc.util;

import org.jn.core.java.student.naushad.jdbc.model.Aeroplane;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import com.google.gson.Gson;

public class AeroplaneUtil {
	public static AeroplaneDto toDtoAuto(Aeroplane aeroplane) {
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(aeroplane), AeroplaneDto.class);
	}
}
