/**
 * 
 */
package org.la.core.java.jawed.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.la.core.java.jawed.model.User;

/**
 * @author jawednazeer
 *
 */
public class UserUtil {

	public static Map<String, User> getMap(){
		return null;
	}
	
	public static List<User> getList(){
		User u1 = new User(1, "a");
		User u2 = new User(2, "b");
		User u3 = new User(3, "c");
		User u4 = new User(4, "d");
		List<User> list = Arrays.asList(u1, u2, u3, u4);
		return list;
	}
}
