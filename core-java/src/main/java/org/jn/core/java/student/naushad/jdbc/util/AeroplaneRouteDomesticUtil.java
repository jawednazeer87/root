package org.jn.core.java.student.naushad.jdbc.util;

import org.jn.core.java.student.naushad.jdbc.model.AeroplaneRouteDomestic;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneRouteDomesticDto;

import com.google.gson.Gson;

public class AeroplaneRouteDomesticUtil {
	public static AeroplaneRouteDomesticDto toDtoAuto(AeroplaneRouteDomestic aeroplaneRouteDomestic) {
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(aeroplaneRouteDomestic), AeroplaneRouteDomesticDto.class);
	}
}
