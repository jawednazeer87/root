package org.jn.adv.waleed.jdbc.myutil;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

/**
 * @author Waleed Rizq
 *
 * @date Mar 20, 2022
 */
public class GenericUtil {
	
	
	public static <T> T map(Object object, Class<T> clazz) {
		Gson gson = new Gson();
		String json = gson.toJson(object);
		return gson.fromJson(json, clazz);
	}
	
	public static <S, T> List<T> mapList(List<S> srcList, Class<T> clazz) {
		List<T> targetList = new ArrayList<>();
		for(S s : srcList) {
			T t = map(s, clazz);
			targetList.add(t);
		}
		return targetList;
	}

}
