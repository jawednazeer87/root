/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.Collections;
import java.util.List;

import org.la.core.java.jawed.model.User;
import org.la.core.java.jawed.util.UserUtil;

/**
 * @author jawednazeer
 *
 */
public class UserListSort {
	public static void main(String[] args) {
		List<User> userList = UserUtil.getList();
		Collections.reverse(userList);
	}
}
