package org.jn.core.java.student.naushad.jdbc.util;

import org.jn.core.java.student.naushad.jdbc.model.Attendee;
import org.jn.core.java.student.naushad.jdbc.model.dto.AttendeeDto;

import com.google.gson.Gson;

public class AttendeeUtil {
	public static AttendeeDto toDtoAuto(Attendee attendee) {
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(attendee), AttendeeDto.class);
	}
}
