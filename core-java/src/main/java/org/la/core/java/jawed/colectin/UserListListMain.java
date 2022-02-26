/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.ArrayList;
import java.util.List;

import org.la.core.java.jawed.model.User;
import org.la.core.java.jawed.util.UserUtil;

/**
 * @author jawednazeer
 *
 */
public class UserListListMain {
	public static void main(String[] args) {
		List<User> userList = UserUtil.getList();
		List<List<User>> userListList = new ArrayList<>();
		userListList.add(userList);
	}
}
