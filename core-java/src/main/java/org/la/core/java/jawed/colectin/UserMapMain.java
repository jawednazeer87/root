/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.HashMap;
import java.util.Map;

import org.la.core.java.jawed.model.User;

/**
 * @author jawednazeer
 *
 */
public class UserMapMain {

	public static void main(String[] args) {
		Map<User, Integer> map = new HashMap<>();
		User u1 = new User(1, "a");
		User u2 = new User(2, "b");
		User u3 = new User(3, "c");
		User u4 = new User(1, "d");
		map.put(u1, 1);
		map.put(u2, 2);
		map.put(u3, 3);
		map.put(u4, 4);
		Integer i = map.get(u1);
		System.out.println("i: "+i);
		i = map.get(u2);
		System.out.println("i: "+i);
		i = map.get(u3);
		System.out.println("i: "+i);
		i = map.get(u4);
		System.out.println("i: "+i);
	}
}
