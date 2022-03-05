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
public class GSONGenericUtil<T> {
	private Class<T> type;
	public GSONGenericUtil(Class<T> type) {
      this.type = type;
    }
	public Class<T> getType() {
		return type;
	}
	public T jsonToObject(String fileName) {
		Gson gson = new Gson();
		String filePath = Constants.JSON_DIRECTORY_PATH + fileName;
		T t = null;
		try (Reader reader = new FileReader(filePath)) {

			// Convert JSON File to Java Object
			t = gson.fromJson(reader, getType());
		}
		catch (Exception e) {
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
			student = gson.fromJson(reader, new TypeToken<List<P>>(){}.getType());

		} catch (IOException e) {
			e.printStackTrace();
		}
		return student;
	}
}
