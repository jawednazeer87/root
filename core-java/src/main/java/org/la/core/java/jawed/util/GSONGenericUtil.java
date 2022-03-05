/**
 * 
 */
package org.la.core.java.jawed.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.la.core.java.jawed.common.Constants;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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

	public static <T> T jsonToObject(String fileName, Class<T> clazz) {
		Gson gson = new Gson();
		String filePath = Constants.JSON_DIRECTORY_PATH + fileName;
		T t = null;
		try (Reader reader = new FileReader(filePath)) {
			// Convert JSON File to Java Object
			t = gson.fromJson(reader, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	public static <P> List<P> getList(String fileName) {
		Gson gson = new Gson();
		String filePath = Constants.JSON_DIRECTORY_PATH + fileName;
		List<P> student = null;
		try (Reader reader = new FileReader(filePath)) {
			// Convert JSON File to Java Object
			student = gson.fromJson(reader, new TypeToken<List<P>>() {
			}.getType());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return student;
	}
}