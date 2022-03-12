package org.jn.adv.jawed.jdbc.util;

import com.google.gson.Gson;

/**
 * @author jawednazeer
 *
 */
public class GSONGenericUtil {

	public static <T> T map(Object object, Class<T> clazz) {
		Gson gson = new Gson();
		String json = gson.toJson(object);
		return gson.fromJson(json, clazz);
	}
}
